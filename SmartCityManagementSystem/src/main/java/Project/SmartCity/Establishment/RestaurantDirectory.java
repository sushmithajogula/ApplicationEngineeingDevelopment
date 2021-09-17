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
public class RestaurantDirectory {
    public ArrayList<Restaurant> restaurantList;

    public RestaurantDirectory() {
        restaurantList = new ArrayList();
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }
    public void removeRestaurant(Restaurant university){
        restaurantList.remove(university);
    }
    
    public Restaurant getRestaurant(String name){
        for(Restaurant dm : restaurantList){
            if(dm.getName().equals(name))
                return dm;
        }
        return null;
    }
    
    public Restaurant createRestaurant(String name, String[] location, String username){
        Restaurant restaurant = new Restaurant();
        restaurant.setName(name);
        restaurant.setLocation(location);
        restaurant.setUsername(username);
        restaurant.setId(restaurantList.size()+1);
        restaurantList.add(restaurant);
        return restaurant;
    }
}
