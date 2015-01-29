/*
 * Class : ShippingRole.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Nov 2, 2014, 10:10:55 PM
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
import Business.customer.CustomerDirectory;
import Business.organization.CustomerOrganization;
import Business.organization.Organization;
import Business.useraccount.UserAccount;
import UserInterface.Sales.SalesWorkAreaJPanel;
import UserInterface.Shipping.ShippingWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Laksh
 */
public class ShippingRole extends Role{
    
    public ShippingRole(){
        super(RoleType.Shipping.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Business business) {
        CustomerDirectory customerDirectory = null;
        for (Organization organization1 :  business.getOrganizationDirectory().getOrganizationList()){
            if (organization1 instanceof CustomerOrganization){
                    customerDirectory = organization1.getPersonDirectory().getCustomerDirectory();
            }
        }
        return new ShippingWorkAreaJPanel(userProcessContainer,customerDirectory);
    }
    
}
