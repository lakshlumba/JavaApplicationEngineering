/*
 * Class : ShippingOrganization.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Nov 2, 2014, 10:06:34 PM
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
import Business.role.ShippingRole;
import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class ShippingOrganization extends Organization{
    
    public ShippingOrganization() {
        super(Type.Shipping.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles =  new ArrayList<Role>();
        roles.add(new ShippingRole());
        return roles;
    }
}
