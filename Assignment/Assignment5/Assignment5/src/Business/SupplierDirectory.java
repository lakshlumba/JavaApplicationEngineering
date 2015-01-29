/*
 * To change this template, choose Tools | Templates
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

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.supplierList = supplierList;
    }
    
    public SupplierDirectory() {
        supplierList = new ArrayList<Supplier>();
    }   
    /**
     * 
     * @return 
     */
    public Supplier addSupplier() {
        Supplier supplier = new Supplier();
        supplierList.add(supplier);
        return supplier;
    }
    /*
    */
    public void removeSupplier(Supplier supplier) {
        supplierList.remove(supplier);
    }
    /**
     * 
     * @param keyWord
     * @return 
     */
    public Supplier searchSupplier(String keyWord) {
        for(Supplier supplier : supplierList) {
            if(keyWord.equals(supplier.getFirstName())) {
                return supplier;
            }
        }
        return null;
    }
    
}
