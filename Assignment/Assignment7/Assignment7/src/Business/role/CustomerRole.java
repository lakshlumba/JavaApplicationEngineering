/*
 * Class : CustomerRole.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 18, 2014, 1:38:50 PM
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
package Business.role;

import Business.business.Business;
import Business.customer.Customer;
import Business.organization.Organization;
import Business.organization.SupplierOrganization;
import Business.supplier.SupplierDirectory;
import Business.useraccount.UserAccount;
import javax.swing.JPanel;
import UserInterface.customer.CustomerWorkAreaJPanel;


/**
 *
 * @author Laksh
 */
public class CustomerRole extends Role{
    
    public CustomerRole(){
        super(RoleType.Customer.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Business business) {
        String customerId = String.valueOf(userAccount.getPerson().getPersonId());
        Customer customer = organization.getPersonDirectory().getCustomerDirectory().searchCustomer(customerId);
        SupplierDirectory supplierDirectory = null;
        for (Organization organization1 :  business.getOrganizationDirectory().getOrganizationList()){
            if (organization1 instanceof SupplierOrganization){
                    supplierDirectory = organization1.getPersonDirectory().getSupplierDirectory();
            }
        }
        return new CustomerWorkAreaJPanel(userProcessContainer,supplierDirectory,customer);
    }

   
    
}
