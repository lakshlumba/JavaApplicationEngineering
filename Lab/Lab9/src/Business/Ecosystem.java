/*
 * Class : Ecosystem.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Nov 8, 2014, 9:26:43 AM
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

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class Ecosystem extends Organization{
    private static Ecosystem ecosystem;
    private final ArrayList<Network> networkList;
    public static Ecosystem getInstance(){
        if (ecosystem == null){
            return new Ecosystem();
        }
        return ecosystem;
    }
    private Ecosystem(){
        super(null);
        networkList = new ArrayList<Network>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SystemAdminRole());
        return roles;
    }
    public Network createAddNetwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

}
