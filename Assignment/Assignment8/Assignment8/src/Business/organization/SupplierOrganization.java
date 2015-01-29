/*
 * Class : SupplierOrganization.java
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
package Business.organization;

import Business.role.Role;
import Business.role.SupplierRole;
import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class SupplierOrganization extends Organization{

    public SupplierOrganization() {
        super(Type.Supplier.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles =  new ArrayList<Role>();
        roles.add(new SupplierRole());
        return roles;
    }
    
}
