/*
 * Class : WorkQueue.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 18, 2014, 1:52:20 PM
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
package buiness.workrequest;

import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class WorkQueue {
    private ArrayList<WorkRequest> workRequestList;

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }


    public WorkQueue() {
        this.workRequestList = new ArrayList<WorkRequest>();
    }
    
}
