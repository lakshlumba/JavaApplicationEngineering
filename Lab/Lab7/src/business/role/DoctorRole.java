/*
 * Class : DoctorRole.java
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
package business.role;

import business.Business;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.doctorworkarea.DoctorWorkAreaJPanel;

/**
 *
 * @author Laksh
 */
public class DoctorRole extends Role{

     public DoctorRole(){
        super(RoleType.Doctor.getValue());
    }
    
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Business business) {
        return new DoctorWorkAreaJPanel(userProcessContainer,business,organization,userAccount);
    }
    
}
