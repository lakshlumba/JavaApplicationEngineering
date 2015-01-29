/*
 * Class : LabOrganization.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 18, 2014, 1:37:53 PM
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

import business.role.LabAssistantRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class LabOrganization extends Organization{

    public LabOrganization() {
        super(Type.Lab.getValue());
    }
    
    
     @Override
    public ArrayList<Role> getSupportedRoles() {
         ArrayList<Role> roles =  new ArrayList<>();
        roles.add(new LabAssistantRole());
        return roles;
    }
    
}
