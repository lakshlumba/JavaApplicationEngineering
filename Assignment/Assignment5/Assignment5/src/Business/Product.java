/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

/**
 *
 * @author Laksh
 */
public class Product {
    private static int count = 0;
    private String prodName;
    private int price;
    private int modelNumber;
    private int available;
    private int initialQuantity;

    public int getInitialQuantity() {
        return initialQuantity;
    }

    public void setInitialQuantity(int initialQuantity) {
        this.initialQuantity = initialQuantity;
    }
    
    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public Product() {
        count++;
        modelNumber = count;
    }
    
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getModelNumber() {
        return modelNumber;
    }
    
    @Override
    public String toString() {
        return prodName;
    }
    
}
