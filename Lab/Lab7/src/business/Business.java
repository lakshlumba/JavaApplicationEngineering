/*
 * Class : Business.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 18, 2014, 1:33:01 PM
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
package business;

import business.organization.OrganizationDirectory;

/**
 *
 * @author Laksh
 */
public class Business {
    private static Business business;
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    public Business(){
        this.organizationDirectory = new OrganizationDirectory();
    }
    
    public static Business getInstance(){
        if (business == null) 
            business = new Business();
        return business;
    }
}
