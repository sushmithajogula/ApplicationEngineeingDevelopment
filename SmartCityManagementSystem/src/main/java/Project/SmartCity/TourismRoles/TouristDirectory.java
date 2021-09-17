/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.TourismRoles;

import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class TouristDirectory {
    public ArrayList<Tourist> touristList;

    public TouristDirectory() {
        touristList = new ArrayList();
    }

    public ArrayList<Tourist> getTouristList() {
        return touristList;
    }
    
    public void removeTourist(Tourist customer){
        touristList.remove(customer);
    }
    
    public Tourist getTourist(String name){
        for(Tourist c : touristList){
            if(c.getName().equals(name))
                return c;
        }
        return null;
    }
    
    public Tourist getTourist(int id){
        for(Tourist c : touristList){
            if(c.getTouristid() == id)
                return c;
        }
        return null;
    }
    
    public Tourist createTourist(String username, String country, String tourismcompany){
        Tourist tourist = new Tourist();
        tourist.setUsername(username);
        tourist.setCountry(country);
        tourist.setTourismcompany(tourismcompany);
        tourist.setId(touristList.size()+1);
        touristList.add(tourist);
        return tourist;
    }  
    
}
