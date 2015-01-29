/*
 * Class : AdminOrganization.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 18, 2014, 1:38:10 PM
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
package business.organization;

import business.role.AdminRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class AdminOrganization extends Organization{

    public AdminOrganization() {
        super(Type.Admin.getValue());
    }

    
    
    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles =  new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
    
}
