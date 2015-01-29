/*
 * Class : SalesPersonDirectory.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Nov 2, 2014, 10:19:06 PM
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
package Business.salesperson;

import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class SalesPersonDirectory {
    
    private ArrayList<SalesPerson> salesPersonList;
    public SalesPersonDirectory() {
        this.salesPersonList = new ArrayList<SalesPerson>();
    }

    public ArrayList<SalesPerson> getSalesPersonList() {
        return salesPersonList;
    }

    public void setSalesPersonList(ArrayList<SalesPerson> salesPersonList) {
        this.salesPersonList = salesPersonList;
    }

      
    /**
     * 
     * @return 
     */
    public SalesPerson addSalesPerson(){
        SalesPerson salesPerson = new SalesPerson();
        salesPersonList.add(salesPerson);
        return salesPerson;
    }
    /**
     * 
     * @param salesPerson 
     */
    public void removeSalesPerson(SalesPerson salesPerson){
        salesPersonList.remove(salesPerson);
    }
    /**
     * 
     * @param salesPersonID
     * @return 
     */
    public SalesPerson searchSalesPerson(String salesPersonID){
        for (SalesPerson salesPerson : salesPersonList) {
            if (salesPersonID.equals(String.valueOf(salesPerson.getPersonId()))) {
                return salesPerson;
            }
        }
        return null;
    }
    
}
