/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.supplier;

import Business.person.Person;
import Business.product.ProductCatalog;

/**
 *
 * @author Laksh
 */
public class Supplier extends Person{
    
    private ProductCatalog productCatalog;
    
    public Supplier() {
        productCatalog = new ProductCatalog();
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }
    
    @Override
    public String toString() {
        return getName();
    }
    
}
