/*
 * Class : Business.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 6, 2014, 2:23:00 AM
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
package Business.business;

import Business.order.MasterOrderCatalog;
import Business.organization.OrganizationDirectory;

/**
 *
 * @author Laksh
 */
public class Business {
    public static Business business;
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    private MasterOrderCatalog masterOrderCatalog;  

   
 

    public static Business getInstance(){
        if (business == null) 
            business = new Business();
        return business;
    }
   

    public Business() {
        this.masterOrderCatalog = new MasterOrderCatalog();
        this.organizationDirectory = new OrganizationDirectory();
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }
    
}
