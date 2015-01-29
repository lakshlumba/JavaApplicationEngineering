/*
 * Class : Role.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 20, 2014, 4:38:13 PM
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

/**
 *
 * @author Laksh
 */
public abstract class Role {
    private final String role;
    public enum RoleType{
        Admin("Admin"),
        Supplier("Supplier"),
        Customer("Customer"),
        Sales("Sales"),
        Shipping("Shipping");
        
        private final String value;
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
