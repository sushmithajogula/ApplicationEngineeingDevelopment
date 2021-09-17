/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.Establishment;

import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class OrderDirectory {
    public ArrayList<Order> orderList;

    public OrderDirectory() {
        orderList = new ArrayList();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }
    
    public Order createOrder(String cost){
        Order order = new Order();
        order.setId(orderList.size()+1);
        order.setCost(cost);
        orderList.add(order);
        return order;
    }
    
    public Order addOrder(Order order){
        orderList.add(order);
        return order;
    }
    
    public Order getOrder(Integer id){
        for(Order o : orderList){
            if(o.getId()== id){
                return o;
            }
        }
        return null;
    }
    
    public Order findOrder(Order order){
        for(Order o : orderList){
            if(o.equals(order)){
                return o;
            }
        }
        return null;
    }
}
