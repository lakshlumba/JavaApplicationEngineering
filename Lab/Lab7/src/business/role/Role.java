/*
 * Class : Role.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 18, 2014, 1:38:25 PM
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

/**
 *
 * @author Laksh
 */
public abstract class Role {
    private String role;
    public enum RoleType{
        Admin("Admin Organization"),
        Doctor("Doctor Organization"),
        Lab("Lab Organization");
        private String value;
        private RoleType(String value){
            this.value = value;
        }
        public String getValue(){
            return value;
        }
    }

    public Role(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return role;
    }
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization,Business business);
    
}
