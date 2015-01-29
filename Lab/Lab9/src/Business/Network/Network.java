/*
 * Class : Network.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Nov 8, 2014, 9:31:44 AM
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
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Laksh
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    public Network(){
        enterpriseDirectory = new EnterpriseDirectory();
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
