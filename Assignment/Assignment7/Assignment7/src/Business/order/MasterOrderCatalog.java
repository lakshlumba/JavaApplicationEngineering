/*
 * Class : MasterOrderCatalog.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 6, 2014, 2:23:22 AM
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
package Business.order;

import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class MasterOrderCatalog {
    private ArrayList<Order> orderList;

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public MasterOrderCatalog() {
        this.orderList = new ArrayList<Order>();
    }
    
    public Order addOrder(Order order){
        orderList.add(order);
        return order;
    }
}
