/*
 * Class : EmployeeDirectory.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 18, 2014, 1:36:46 PM
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
package business.employee;

import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeList;

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public EmployeeDirectory() {
        this.employeeList = new ArrayList<Employee>();
    }
    
    public Employee createEmployee(){
        Employee employee = new Employee();
        employeeList.add(employee);
        return employee;
    }
}
