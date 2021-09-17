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
public class ShopOrder {
    public int id;
    public String cost;
    public ArrayList<Item> itemList;
    public String status = "Active";
    public String comments;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getStatus() {
        return status;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
    

    public void setStatus(String status) {
        this.status = status;
    }
            
    public ShopOrder() {
        itemList = new ArrayList();
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public int getId() {
        return id;
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }
    
    public void removeItem(Item item) {
        this.itemList.remove(item);
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
}
