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
public class Menu {
    public ArrayList<MenuItem> itemList;

    public Menu() {
        itemList = new ArrayList();
        MenuItem item = this.addItem("Paneer", "30", "20");
        item.setType("Veg");
    }
    
    public ArrayList<MenuItem> getItemList() {
        return itemList;
    }
    
    public MenuItem getItem(String name) {
        for(MenuItem i : itemList){
            if(i.getName().equals(name))
                return i;
        }
        return null;
    }
    
    public MenuItem getItem(int id) {
        for(MenuItem i : itemList){
            if(i.getId() == id)
                return i;
        }
        return null;
    }
    
    public void setItemList(ArrayList<MenuItem> itemList) {
        this.itemList = itemList;
    }
    
    public MenuItem addItem(String name, String cal, String cost){
        MenuItem item = new MenuItem();
        item.setName(name);
        item.setCal(cal);
        item.setCost(cost);
        itemList.add(item);
        return item;
    }
    
    public void removeItem(MenuItem item){
        itemList.remove(item);
    }
}
