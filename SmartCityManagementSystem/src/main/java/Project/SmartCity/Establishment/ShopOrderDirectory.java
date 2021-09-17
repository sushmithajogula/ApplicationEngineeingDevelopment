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
public class ShopOrderDirectory {
    public ArrayList<ShopOrder> orderList;

    public ShopOrderDirectory() {
        orderList = new ArrayList();
    }

    public ArrayList<ShopOrder> getOrderList() {
        return orderList;
    }
    
    public ShopOrder createShopOrder(String cost){
        ShopOrder order = new ShopOrder();
        order.setId(orderList.size()+1);
        order.setCost(cost);
        orderList.add(order);
        return order;
    }
    
    public ShopOrder addShopOrder(ShopOrder order){
        orderList.add(order);
        return order;
    }
    
    public ShopOrder getShopOrder(Integer id){
        for(ShopOrder o : orderList){
            if(o.getId()== id){
                return o;
            }
        }
        return null;
    }
    
    public ShopOrder findShopOrder(ShopOrder order){
        for(ShopOrder o : orderList){
            if(o.equals(order)){
                return o;
            }
        }
        return null;
    }
}
