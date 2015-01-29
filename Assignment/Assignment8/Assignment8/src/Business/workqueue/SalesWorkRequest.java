/*
 * Class : SalesWorkRequest.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Nov 2, 2014, 11:33:04 PM
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


/**
 *
 * @author Laksh
 */
public class SalesWorkRequest extends WorkRequest{
    
    String approvalRequest;

    public String getApprovalRequest() {
        return approvalRequest;
    }

    public void setApprovalRequest(String approvalRequest) {
        this.approvalRequest = approvalRequest;
    }

    @Override
    public String toString(){
        return this.getMessage();
    }
}
