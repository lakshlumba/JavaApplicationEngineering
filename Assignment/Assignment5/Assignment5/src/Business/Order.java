/*
 * Class : Order.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 6, 2014, 2:15:18 AM
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
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Laksh
 */
public class Order {
    private static int count = 0;
    private ArrayList<OrderItem> orderItemList;
    private int orderId;
    private Date creationDate;

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Order() {
        count++;
        this.orderItemList =  new ArrayList<OrderItem>();
        this.orderId = count;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderId() {
        return orderId;
    }
    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    /**
     * 
     * @param product
     * @param quantity
     * @return 
     */
    public OrderItem addOrderItem(Product product , int quantity){
        OrderItem orderItem = new OrderItem();
        orderItem.setProduct(product);
        orderItem.setQuantity(quantity);
        orderItemList.add(orderItem);
        return orderItem;        
    }
    /**
     * remove the order item
     * @param orderItem 
     */
    public void removeItem(OrderItem orderItem) {
        orderItemList.remove(orderItem);
    }

    @Override
    public String toString() {
        return String.valueOf(orderId);
    }
    
}
