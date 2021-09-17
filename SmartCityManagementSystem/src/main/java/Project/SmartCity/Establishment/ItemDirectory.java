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
public class ItemDirectory {
    public ArrayList<Item> itemList;

    public ItemDirectory() {
        itemList = new ArrayList();
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }
    
    public void removeItem(Item item){
        itemList.remove(item);
    }
    
    public Item getItem(String name){
        for(Item dm : itemList){
            if(dm.getName().equals(name))
                return dm;
        }
        return null;
    }
    
    public Item getItem(int id){
        for(Item dm : itemList){
            if(dm.getId() == id)
                return dm;
        }
        return null;
    }
    
    public Item createItem(String name){
        Item item = new Item();
        item.setName(name);
        item.setId(itemList.size()+1);
        itemList.add(item);
        return item;
    }
}
