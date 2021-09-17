/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.EstablishmentRoles;

import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class ManagerDirectory {
    public ArrayList<Manager> managerList;

    public ManagerDirectory() {
        managerList = new ArrayList();
    }

    public ArrayList<Manager> getmanagerList() {
        return managerList;
    }
    
    public void removeManager(Manager manager){
        managerList.remove(manager);
    }
    
    public Manager getManager(String name){
        for(Manager c : managerList){
            if(c.getName().equals(name))
                return c;
        }
        return null;
    }
    
    public Manager createManager(String businessName, String businessType){
        Manager manager = new Manager(businessName, businessType);
        manager.setBusinessName(businessName);
        manager.setBusinessType(businessType);
        manager.setId(managerList.size()+1);
        managerList.add(manager);
        return manager;
    }
    
    public Manager createManager(){
        Manager manager = new Manager();
        manager.setId(managerList.size()+1);
        managerList.add(manager);
        return manager;
    }
}
