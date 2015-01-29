/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author raunak
 */
public class ConfigureASystem {
    
    public static Ecosystem configure(){
        
        Ecosystem ecosystem = Ecosystem.getInstance();
        
    
        Employee employee = ecosystem.getEmployeeDirectory().createEmployee("laksh");
        UserAccount userAccount = ecosystem.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());
        
        return ecosystem;
    }
    
}
