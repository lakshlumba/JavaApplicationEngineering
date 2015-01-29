/*
 * Class : SupplierRole.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 18, 2014, 1:38:58 PM
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
import Business.organization.Organization;
import Business.organization.SalesOrganization;
import Business.supplier.Supplier;
import Business.useraccount.UserAccount;
import javax.swing.JPanel;
import UserInterface.SupplierRole.SupplierWorkAreaJPanel;

/**
 *
 * @author Laksh
 */
public class SupplierRole extends Role{

     public SupplierRole(){
        super(RoleType.Supplier.getValue());
    }   
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Business business) {
        String supplierId = String.valueOf(userAccount.getPerson().getPersonId());
        Supplier supplier = organization.getPersonDirectory().getSupplierDirectory().searchSupplier(supplierId); 
        Organization organization1 = null;
        for (Organization organization2 : business.getOrganizationDirectory().getOrganizationList()){
            if (organization2 instanceof SalesOrganization){
                organization1 = organization2;
            }
        }        
        return new SupplierWorkAreaJPanel(userProcessContainer,supplier,userAccount, (SalesOrganization) organization1);
    }
    
}
