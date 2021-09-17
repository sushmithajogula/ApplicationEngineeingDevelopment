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
public class FlightDirectory {
    public ArrayList<Flight> flightList;

    public FlightDirectory() {
        flightList = new ArrayList();
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }
    public void removeFlight(Flight flight){
        flightList.remove(flight);
    }
    
    public Flight getFlight(int id){
        for(Flight dm : flightList){
            if(dm.getId() == id)
                return dm;
        }
        return null;
    }
    
    public Flight createFlight(String number, String startLocation, String dropLocation, String username){
        Flight flight = new Flight();
        flight.setNumber(number);
        flight.setStartLocation(startLocation);
        flight.setDropLocation(dropLocation);
        flight.setUsername(username);
        flight.setId(flightList.size()+1);
        flightList.add(flight);
        return flight;
    }
}
