/*
 * Class : Employee.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 11, 2014, 1:27:19 PM
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

/**
 *
 * @author Laksh
 */
public class Employee extends Person{
    private final int empId;
    private String organization;
    private static int count =1000;

    public int getEmpId() {
        return empId;
    }

    public Employee() {
        this.empId = count++;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
    @Override
    public String toString(){
        return super.getFirstName();
    }
}
