/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.TransportationSystem;

import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class CruiseDirectory {
    public ArrayList<Cruise> cruiseList;

    public CruiseDirectory() {
        cruiseList = new ArrayList();
    }

    public ArrayList<Cruise> getCruiseList() {
        return cruiseList;
    }
    public void removeCruise(Cruise cruise){
        cruiseList.remove(cruise);
    }
    
    public Cruise getCruise(int id){
        for(Cruise dm : cruiseList){
            if(dm.getId() == id)
                return dm;
        }
        return null;
    }
    
    public Cruise createCruise(String number, String startLocation, String dropLocation, String username){
        Cruise cruise = new Cruise();
        cruise.setNumber(number);
        cruise.setStartLocation(startLocation);
        cruise.setDropLocation(dropLocation);
        cruise.setUsername(username);
        cruise.setId(cruiseList.size()+1);
        cruiseList.add(cruise);
        return cruise;
    }
}
