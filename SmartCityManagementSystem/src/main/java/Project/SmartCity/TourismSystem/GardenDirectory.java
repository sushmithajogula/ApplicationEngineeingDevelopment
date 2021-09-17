/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.TourismSystem;

import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class GardenDirectory {
    public ArrayList<Garden> gardenList;

    public GardenDirectory() {
        gardenList = new ArrayList();
    }

    public ArrayList<Garden> getGardenList() {
        return gardenList;
    }
    public void removeGarden(Garden garden){
        gardenList.remove(garden);
    }
    
    public Garden getGarden(String name){
        for(Garden dm : gardenList){
            if(dm.getName().equals(name))
                return dm;
        }
        return null;
    }
    
    public Garden getGarden(int id){
        for(Garden dm : gardenList){
            if(dm.getId() == id)
                return dm;
        }
        return null;
    }
    
    public Garden createGarden(String name, String[] location, String username){
        Garden garden = new Garden();
        garden.setName(name);
        garden.setLocation(location);
        garden.setUsername(username);
        garden.setId(gardenList.size()+1);
        gardenList.add(garden);
        return garden;
    }
}
