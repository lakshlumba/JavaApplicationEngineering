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
package Business;

/**
 *
 * @author Laksh
 */
public class ConfigureBusiness {
    public static Business initialize(){
        Business business = Business.getInstance();
        UserAccount userAccount = business.getUserAccountDirectory().addUserAccount();
        userAccount.setUsername("admin");
        userAccount.setPassword("password");
        userAccount.setRole(UserAccount.ADMIN);
        userAccount.setStatus("Active");
        return business;
    }
    
}
