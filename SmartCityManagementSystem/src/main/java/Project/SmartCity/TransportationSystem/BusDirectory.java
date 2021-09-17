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
public class BusDirectory {
    public ArrayList<Bus> busList;

    public BusDirectory() {
        busList = new ArrayList();
    }

    public ArrayList<Bus> getBusList() {
        return busList;
    }
    public void removeBus(Bus bus){
        busList.remove(bus);
    }
    
    public Bus getBus(int id){
        for(Bus dm : busList){
            if(dm.getId() == id)
                return dm;
        }
        return null;
    }
    
    public Bus createBus(String number, String startLocation, String dropLocation, String username){
        Bus bus = new Bus();
        bus.setNumber(number);
        bus.setStartLocation(startLocation);
        bus.setDropLocation(dropLocation);
        bus.setUsername(username);
        bus.setId(busList.size()+1);
        busList.add(bus);
        return bus;
    }
}
