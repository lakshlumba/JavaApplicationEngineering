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

import Business.order.MasterOrderCatalog;
import Business.person.Person;

/**
 *
 * @author Laksh
 */
public class Customer extends Person{

    private MasterOrderCatalog customerOrderCatalog;

    public MasterOrderCatalog getCustomerOrderCatalog() {
        return customerOrderCatalog;
    }

    public void setCustomerOrderCatalog(MasterOrderCatalog customerOrderCatalog) {
        this.customerOrderCatalog = customerOrderCatalog;
    }

    public Customer() {
        super();
        this.customerOrderCatalog = new MasterOrderCatalog();
    }

    @Override
    public String toString() {
        return getName();
    }
    
}
