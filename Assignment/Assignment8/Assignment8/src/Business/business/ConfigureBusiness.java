/*
 * Class : ConfigureBusiness.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 14, 2014, 1:58:00 PM
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

import Business.organization.AdminOrganization;
import Business.person.Person;
import Business.role.AdminRole;
import Business.useraccount.UserAccount;

/**
 *
 * @author Laksh
 */
public class ConfigureBusiness {
    public static Business initialize(){
        Business business = Business.getInstance();
        AdminOrganization adminOrganization = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        Person person = new Person();
        person.setName("Administrator");       
        UserAccount userAccount = adminOrganization.getUserAccountDirectory().createUserAccount("admin", "password", new AdminRole(),person,"Active");
        return business;
    }
    
}
