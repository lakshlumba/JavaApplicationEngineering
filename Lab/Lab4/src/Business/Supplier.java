/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Laksh
 */
public class Supplier {
    private String supplierName;
    private ProductCatalog productCatalog;

    /**
     * @return the supplierName
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * @param supplierName the supplierName to set
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Override
    public String toString() {
        return supplierName;
    }  

    /**
     * @return the productCatalog
     */
    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    /**
     * @param productCatalog the productCatalog to set
     */
    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }
}
