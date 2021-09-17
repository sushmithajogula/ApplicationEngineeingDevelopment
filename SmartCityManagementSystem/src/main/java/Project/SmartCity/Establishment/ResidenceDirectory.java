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
public class ResidenceDirectory {
    public ArrayList<Residence> residenceList;

    public ResidenceDirectory() {
        residenceList = new ArrayList();
    }

    public ArrayList<Residence> getResidenceList() {
        return residenceList;
    }
    public void removeResidence(Residence university){
        residenceList.remove(university);
    }
    
    public Residence getResidence(String name){
        for(Residence dm : residenceList){
            if(dm.getName().equals(name))
                return dm;
        }
        return null;
    }
    
    public Residence createResidence(String name, String[] location, String username){
        Residence residence = new Residence();
        residence.setName(name);
        residence.setLocation(location);
        residence.setUsername(username);
        residence.setId(residenceList.size()+1);
        residenceList.add(residence);
        return residence;
    }
}
