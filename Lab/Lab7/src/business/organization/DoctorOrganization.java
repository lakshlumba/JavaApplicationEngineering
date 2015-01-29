/*
 * Class : DoctorOrganization.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 18, 2014, 1:37:41 PM
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

import business.role.DoctorRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class DoctorOrganization extends Organization{

    public DoctorOrganization() {
        super(Type.Doctor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles =  new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }
    
}
