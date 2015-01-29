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
public class ProductCatalog {
    private ArrayList<Product> productList;

    public ProductCatalog() {
        this.productList = new ArrayList<Product>();        
    }

    /**
     * @return the productList
     */
    public ArrayList<Product> getProductList() {
        return productList;
    }

    /**
     * @param productList the productList to set
     */
    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    /**
     * add the product
     * @return 
     */
    public Product addProduct(){
        Product product = new Product();
        productList.add(product);
        return product;   
    }
    /**
     * delete the product
     * @param product 
     */
    public void deleteProduct(Product product){
        productList.remove(product);
    }
    
    public Product searchProduct(int productId){
        for(Product product : productList){
            if(product.getModelId() == productId){
                return product;
            } 
        }
        return null;
    }
}
