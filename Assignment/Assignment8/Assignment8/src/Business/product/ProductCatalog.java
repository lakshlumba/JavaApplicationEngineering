/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.product;

import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class ProductCatalog {
    
    private ArrayList<Product> productList;

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public ProductCatalog() {
        productList = new ArrayList<Product>();
    }

    
    public Product addProduct() {
        Product product = new Product();
        productList.add(product);
        return product;
    }
    
    public void removeProduct(Product product) {
        productList.remove(product);
    }
    
    public Product searchProduct(int id) {
        //ArrayList<Product> result = new ArrayList<Product>();
        for(Product product : productList) {
            if(product.getModelNumber() == id) {
                return product;
            }
        }
        return null;
    }
}
