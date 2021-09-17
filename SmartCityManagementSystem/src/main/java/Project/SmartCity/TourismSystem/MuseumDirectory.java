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
public class MuseumDirectory {
    public ArrayList<Museum> museumList;
    
    public MuseumDirectory(){
        museumList = new ArrayList();
    }
    
    public ArrayList<Museum> getMuseumList() {
        return museumList;
    }
    public void removeMuseum(Museum museum){
        museumList.remove(museum);
    }
    
    public Museum getMuseum(String name){
        for(Museum dm : museumList){
            if(dm.getName().equals(name))
                return dm;
        }
        return null;
    }
    
    public Museum getMuseum(int id){
        for(Museum dm : museumList){
            if(dm.getId() == id)
                return dm;
        }
        return null;
    }
    
    public Museum createMuseum(String name, String[] location, String username, String[] artifacts){
        Museum museum = new Museum();
        museum.setName(name);
        museum.setLocation(location);
        museum.setUsername(username);
        museum.setArtifactList(artifacts);
        museum.setId(museumList.size()+1);
        museumList.add(museum);
        return museum;
    }
    
    public Museum createMuseum(String name, String[] location, String username){
        Museum museum = new Museum();
        museum.setName(name);
        museum.setLocation(location);
        museum.setUsername(username);
        museum.setId(museumList.size()+1);
        museumList.add(museum);
        return museum;
    }
}
