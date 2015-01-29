/*
 * Class : Organization.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 18, 2014, 1:37:15 PM
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

import Business.person.PersonDirectory;
import Business.role.Role;
import Business.useraccount.UserAccountDirectory;
import Business.workqueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public abstract class Organization {
    private String name;
    private final int orgId;
    private static int counter = 0;
    private final UserAccountDirectory userAccountDirectory;
    private PersonDirectory personDirectory;
    private WorkQueue workQueue;

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }    

    public enum Type{
        Admin("Admin"),
        Supplier("Supplier"),
        Customer("Customer"),
        Sales("Sales"),
        Shipping("Shipping");
        
        private final String value;
        private Type(String value){
            this.value = value;
        }
        public String getValue(){
            return value;
        }
    }
    public abstract ArrayList<Role> getSupportedRoles();

            
    public Organization(String name) {
        this.orgId = counter++;
        this.workQueue = new WorkQueue();
        this.userAccountDirectory = new UserAccountDirectory();
        this.personDirectory = new PersonDirectory();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrgId() {
        return orgId;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
