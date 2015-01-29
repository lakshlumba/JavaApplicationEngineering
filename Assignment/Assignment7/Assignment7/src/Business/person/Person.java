/*
 * Class : Person.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 14, 2014, 1:57:38 PM
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
package Business.person;

/**
 *
 * @author Laksh
 */
public class Person {
    private String name;
    private int personId;
    private static int counter = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public int getPersonId() {
        return personId;
    }   

    public Person() {
        this.personId = counter++;
    }
  
}
