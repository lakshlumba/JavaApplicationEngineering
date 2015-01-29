/*
 * Class : Customer.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 6, 2014, 12:41:11 PM
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

import Business.MasterOrderCatalog;
import Business.Person;

/**
 *
 * @author Laksh
 */
public class Customer extends Person{
    private String customerId;
    private static int id = 1;
    private MasterOrderCatalog customerOrderCatalog;

    public MasterOrderCatalog getCustomerOrderCatalog() {
        return customerOrderCatalog;
    }

    public void setCustomerOrderCatalog(MasterOrderCatalog customerOrderCatalog) {
        this.customerOrderCatalog = customerOrderCatalog;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Customer() {
        id++;
        customerId = "cust" + String.valueOf(id);
        this.customerOrderCatalog = new MasterOrderCatalog();
    }

    @Override
    public String toString() {
        return getFirstName();
    }
    
}
