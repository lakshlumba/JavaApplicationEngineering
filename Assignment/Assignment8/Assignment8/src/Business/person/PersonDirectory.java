/*
 * Class : PersonDirectory.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 14, 2014, 3:29:55 PM
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
package Business.person;

import Business.supplier.SupplierDirectory;
import Business.customer.CustomerDirectory;
import Business.salesperson.SalesPersonDirectory;
import Business.shippingperson.ShippingPersonDirectory;

/**
 *
 * @author Laksh
 */
public class PersonDirectory {
    private SupplierDirectory supplierDirectory;
    private CustomerDirectory customerDirectory;
    private SalesPersonDirectory salesPersonDirectory;
    private ShippingPersonDirectory shippingPersonDirectory;

    public SalesPersonDirectory getSalesPersonDirectory() {
        return salesPersonDirectory;
    }

    public void setSalesPersonDirectory(SalesPersonDirectory salesPersonDirectory) {
        this.salesPersonDirectory = salesPersonDirectory;
    }

    public ShippingPersonDirectory getShippingPersonDirectory() {
        return shippingPersonDirectory;
    }

    public void setShippingPersonDirectory(ShippingPersonDirectory shippingPersonDirectory) {
        this.shippingPersonDirectory = shippingPersonDirectory;
    }

    public PersonDirectory() {
        this.supplierDirectory = new SupplierDirectory();
        this.customerDirectory = new CustomerDirectory();
        this.salesPersonDirectory = new SalesPersonDirectory();
        this.shippingPersonDirectory = new ShippingPersonDirectory();
    }

    
    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
}
