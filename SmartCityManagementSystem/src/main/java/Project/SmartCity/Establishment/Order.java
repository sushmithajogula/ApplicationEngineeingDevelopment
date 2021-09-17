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
public class Order {
    public int id;
    public ArrayList<MenuItem> itemList;
    public String status = "Active";
    public String cost;
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

    public void setStatus(String status) {
        this.status = status;
    }
    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
            
    public Order() {
        itemList = new ArrayList();
    }

    public ArrayList<MenuItem> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<MenuItem> itemList) {
        this.itemList = itemList;
    }

    public int getId() {
        return id;
    }

    public void addItem(MenuItem item) {
        this.itemList.add(item);
    }
    
    public void removeItem(MenuItem item) {
        this.itemList.remove(item);
    }
    
    public void setId(int id) {
        this.id = id;
    }
}
