/*
 * Class : SalesOrganization.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Nov 2, 2014, 10:06:18 PM
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
import Business.role.SalesRole;
import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class SalesOrganization extends Organization{

    public SalesOrganization() {
        super(Type.Sales.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles =  new ArrayList<Role>();
        roles.add(new SalesRole());
        return roles;
    }
    
}
