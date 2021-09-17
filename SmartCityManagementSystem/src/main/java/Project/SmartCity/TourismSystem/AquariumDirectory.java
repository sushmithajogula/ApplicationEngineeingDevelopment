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
public class AquariumDirectory {
    public ArrayList<Aquarium> aqList;

    public AquariumDirectory() {
        aqList = new ArrayList();
    }

    public ArrayList<Aquarium> getAquariumList() {
        return aqList;
    }
    public void removeAquarium(Aquarium Aquarium){
        aqList.remove(Aquarium);
    }
    
    public Aquarium getAquarium(String name){
        for(Aquarium dm : aqList){
            if(dm.getName().equals(name))
                return dm;
        }
        return null;
    }
    
    public Aquarium getAquarium(int id){
        for(Aquarium dm : aqList){
            if(dm.getId() == id)
                return dm;
        }
        return null;
    }
    public Aquarium createAquarium(String name, String[] location, String username){
        Aquarium aquarium = new Aquarium();
        aquarium.setName(name);
        aquarium.setLocation(location);
        aquarium.setUsername(username);
        aquarium.setId(aqList.size()+1);
        aqList.add(aquarium);
        return aquarium;
    }
    
}
