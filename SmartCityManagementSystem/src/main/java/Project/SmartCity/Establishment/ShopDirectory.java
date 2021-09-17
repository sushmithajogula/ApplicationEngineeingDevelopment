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
public class ShopDirectory {
    public ArrayList<Shop> shopList;

    public ShopDirectory() {
        shopList = new ArrayList();
    }

    public ArrayList<Shop> getShopList() {
        return shopList;
    }
    public void removeShop(Shop shop){
        shopList.remove(shop);
    }
    
    public Shop getShop(String name){
        for(Shop dm : shopList){
            if(dm.getName().equals(name))
                return dm;
        }
        return null;
    }
    
    public Shop getShop(int id){
        for(Shop dm : shopList){
            if(dm.getId() == id)
                return dm;
        }
        return null;
    }
    
    public Shop createShop(String name, String[] location, String username){
        Shop shop = new Shop();
        shop.setName(name);
        shop.setLocation(location);
        shop.setUsername(username);
        shop.setId(shopList.size()+1);
        shopList.add(shop);
        return shop;
    }
}
