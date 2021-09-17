/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.TransportationRoles;

import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class CommuterDirectory {
    public ArrayList<Commuter> CommuterList;

    public CommuterDirectory() {
        CommuterList = new ArrayList();
    }

    public ArrayList<Commuter> getCommuterList() {
        return CommuterList;
    }
    
    public void removeCommuter(Commuter customer){
        CommuterList.remove(customer);
    }
    
    public Commuter getCommuter(String name){
        for(Commuter c : CommuterList){
            if(c.getName().equals(name))
                return c;
        }
        return null;
    }
    
    public Commuter createCommuter(String username){
        Commuter commuter = new Commuter();
        commuter.setUsername(username);
        commuter.setId(CommuterList.size()+1);
        CommuterList.add(commuter);
        return commuter;
    }
}