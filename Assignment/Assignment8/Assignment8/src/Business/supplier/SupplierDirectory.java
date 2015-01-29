/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.supplier;

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
            if(keyWord.equals(String.valueOf(supplier.getPersonId())) || keyWord.equals(supplier.getName())) {
                return supplier;
            }
        }
        return null;
    }
    
}
