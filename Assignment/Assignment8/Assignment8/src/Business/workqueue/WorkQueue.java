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
package Business.workqueue;

import java.util.ArrayList;

/**
 *
 * @author laksh
 */
public class WorkQueue {
    
    private final ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<WorkRequest>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}