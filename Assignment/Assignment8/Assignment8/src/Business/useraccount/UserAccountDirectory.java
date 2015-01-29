/*
 * Class : UserAccountDirectory.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 14, 2014, 1:57:21 PM
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
package Business.useraccount;

import Business.person.Person;
import Business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class UserAccountDirectory {
    private final ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        this.userAccountList = new ArrayList<UserAccount>();
    }
    public UserAccount addUserAccount(){
        UserAccount userAccount = new UserAccount();
        userAccountList.add(userAccount);
        return userAccount;    
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticate(String username, String password){
        for (UserAccount userAccount : userAccountList){
            if (userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password)){
                return userAccount;
            }
        }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Role role,Person person,String status){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccount.setPerson(person);
        userAccount.setStatus(status);
        userAccountList.add(userAccount);
        return userAccount;
    }
}
