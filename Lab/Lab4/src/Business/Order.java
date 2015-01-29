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
public class Order {
    private static int count = 0;
    private ArrayList<OrderItem> orderItemList;
    private int orderId;

    public Order() {
        count++;
        orderItemList = new ArrayList<OrderItem>();
        orderId = count;
    }

    /**
     * @return the orderItemList
     */
    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    /**
     * @param orderItemList the orderItemList to set
     */
    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    /**
     * @return the orderId
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    /**
     * 
     * @param product
     * @param quantity
     * @return 
     */
    public OrderItem addOrderItem(Product product, int quantity){
        OrderItem orderItem = new OrderItem();
        orderItem.setQuantity(quantity);
        orderItem.setProduct(product);
        orderItemList.add(orderItem);
        return orderItem;
    }
    /**
     * 
     * @param orderItem 
     */
    public void removeItem(OrderItem orderItem){
        orderItemList.remove(orderItem);
    }
    
}
