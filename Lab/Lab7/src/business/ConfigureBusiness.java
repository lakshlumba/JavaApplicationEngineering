/*
 * Class : ConfigureBusiness.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 18, 2014, 1:36:26 PM
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

import business.employee.Employee;
import business.organization.AdminOrganization;
import business.role.AdminRole;
import business.useraccount.UserAccount;

/**
 *
 * @author Laksh
 */
public class ConfigureBusiness {
    
    public static Business initialize(){
        Business business = Business.getInstance();
        AdminOrganization adminOrganization = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        Employee  employee = new Employee();
        employee.setName("Administrator");
        UserAccount userAccount = adminOrganization.getUserAccountDirectory().createUserAccount("admin", "password", new AdminRole(), employee);
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        return business;
    }
    
}
