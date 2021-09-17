/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.Establishment;

import java.util.ArrayList;

/**
 *
 * @author Okami
 */
public class TheatreDirectory {
    public ArrayList<Theatre> theatreList;

    public TheatreDirectory() {
        theatreList = new ArrayList();
    }
    
    public Theatre createTheatre(String username, String name, String[] location){
        Theatre theatre = new Theatre();
        theatre.setId(theatreList.size()+1);
        theatre.setName(name);
        theatre.setLocation(location);
        theatre.setUsername(username);
        theatreList.add(theatre);
        return theatre;
    }
    
    public Theatre addTheatre(Theatre theatre){
        theatreList.add(theatre);
        return theatre;
    }
    
    public Theatre getTheatre(Integer id){
        for(Theatre o : theatreList){
            if(o.getId()== id){
                return o;
            }
        }
        return null;
    }
    
    public Theatre getTheatre(String name){
        for(Theatre o : theatreList){
            if(o.getName().equals(name)){
                return o;
            }
        }
        return null;
    }

    public ArrayList<Theatre> getTheatreList() {
        return theatreList;
    }

    public void setTheatreList(ArrayList<Theatre> theatreList) {
        this.theatreList = theatreList;
    }
    
    
    
    public Theatre findTheatre(Theatre theatre){
        for(Theatre o : theatreList){
            if(o.equals(theatre)){
                return o;
            }
        }
        return null;
    }
}
