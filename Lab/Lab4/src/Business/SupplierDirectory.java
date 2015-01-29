/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class SupplierDirectory {
    private ArrayList<Supplier> supplierList;

    public SupplierDirectory() {
        this.supplierList =new ArrayList<Supplier>();
    }

    /**
     * @return the supplierList
     */
    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    /**
     * @param supplierList the supplierList to set
     */
    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.supplierList = supplierList;
    }
    /**
     * add the supplier from the list
     * @return 
     */
    public Supplier addSupplier(){
        Supplier supplier = new Supplier();
        supplierList.add(supplier);
        return supplier;   
    }
    /**
     * delete the supplier from the list
     * @param supplier 
     */
    public void deleteSupplier(Supplier supplier){
        supplierList.remove(supplier);
    }
    /**
     * delete the supplier from the list
     * @param supplier 
     */
     public Supplier searchSupplier(String keyWord) {
        for(Supplier supplier : supplierList) {
            if(keyWord.equals(supplier.getSupplierName())) {
                return supplier;
            }
        }
        return null;
    }
}
