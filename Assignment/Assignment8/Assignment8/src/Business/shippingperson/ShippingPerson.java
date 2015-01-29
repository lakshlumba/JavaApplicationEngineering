/*
 * Class : ShippingPerson.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Nov 2, 2014, 10:19:22 PM
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

import Business.person.Person;

/**
 *
 * @author Laksh
 */
public class ShippingPerson extends Person{
    
    @Override
    public String toString() {
        return getName();
    }
}
