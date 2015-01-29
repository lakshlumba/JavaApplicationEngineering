/*
 * Class : ShippingPersonDirectory.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Nov 2, 2014, 10:19:40 PM
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
package Business.shippingperson;


import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class ShippingPersonDirectory {
    private ArrayList<ShippingPerson> shippingPersonList;

    public ArrayList<ShippingPerson> getShippingPersonList() {
        return shippingPersonList;
    }

    public void setShippingPersonList(ArrayList<ShippingPerson> shippingPersonList) {
        this.shippingPersonList = shippingPersonList;
    }
    
    public ShippingPersonDirectory() {
        this.shippingPersonList = new ArrayList<ShippingPerson>();
    }
    
    public ShippingPerson addShippingPerson(){
        ShippingPerson shippingPerson = new ShippingPerson();
        shippingPersonList.add(shippingPerson);
        return shippingPerson;
    }
    
    public void removeShippingPerson(ShippingPerson shippingPerson){
        shippingPersonList.remove(shippingPerson);
    }
    
    public ShippingPerson searchShippingPerson(int shippingPersonId){
        for(ShippingPerson shippingPerson : shippingPersonList){
            if(shippingPersonId == shippingPerson.getPersonId()){
                return shippingPerson;
            }
        }
        return null;
    }
}
