/*
 * Class : AdminRole.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 18, 2014, 1:38:38 PM
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
import Business.useraccount.UserAccount;
import javax.swing.JPanel;
import UserInterface.AdminstrativeRole.AdminWorkAreaJPanel;

/**
 *
 * @author Laksh
 */
public class AdminRole extends Role{

    public AdminRole(){
        super(RoleType.Admin.getValue());
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Business business) {
        return new AdminWorkAreaJPanel(userProcessContainer,business);
    }   
    
}
