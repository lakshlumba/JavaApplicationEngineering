/*
 * Class : UserAccount.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 14, 2014, 1:57:02 PM
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
import Business.workqueue.WorkQueue;

/**
 *
 * @author Laksh
 */
public class UserAccount {
    private String username;
    private String password;
    private Role role;
    private String status;
    private Person person;
    private WorkQueue workQueue;

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    public UserAccount() {
            workQueue = new WorkQueue();
        }
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    @Override
    public String toString(){
        return username;
    }
}
