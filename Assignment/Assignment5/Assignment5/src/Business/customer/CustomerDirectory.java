/*
 * Class : CustomerDirectory.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 6, 2014, 12:41:31 PM
 * ---------------------------------------------------------------------------
 * Change History
 * Develper :
 * Reviwer :
 * Changed ON :
 * ---------------------------------------------------------------------------
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.customer;

import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        this.customerList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }  
    /**
     * 
     * @return 
     */
    public Customer addCustomer(){
        Customer customer = new Customer();
        customerList.add(customer);
        return customer;
    }
    /**
     * 
     * @param customer 
     */
    public void removeCustomer(Customer customer){
        customerList.remove(customer);
    }
    /**
     * 
     * @param customerID
     * @return 
     */
    public Customer searchCustomer(String customerID){
        //Customer customer = new Customer();
        for (Customer customer : customerList) {
            if (customerID.equals(customer.getCustomerId())) {
                return customer;
            }
        }
        return null;
    }
}
