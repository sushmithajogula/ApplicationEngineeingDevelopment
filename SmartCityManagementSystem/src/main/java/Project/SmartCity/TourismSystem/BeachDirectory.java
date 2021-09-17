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
public class BeachDirectory {
    public ArrayList<Beach> beachList;

    public BeachDirectory() {
        beachList = new ArrayList();
    }

    public ArrayList<Beach> getBeachList() {
        return beachList;
    }
    public void removeBeach(Beach beach){
        beachList.remove(beach);
    }
    
    public Beach getBeach(String name){
        for(Beach dm : beachList){
            if(dm.getName().equals(name))
                return dm;
        }
        return null;
    }
    
    public Beach getBeach(int id){
        for(Beach dm : beachList){
            if(dm.getId() == id)
                return dm;
        }
        return null;
    }
    
    public Beach createBeach(String name, String[] location, String username){
        Beach beach = new Beach();
        beach.setName(name);
        beach.setLocation(location);
        beach.setUsername(username);
        beach.setId(beachList.size()+1);
        beachList.add(beach);
        return beach;
    }
}
