/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.HealthcareRoles;

import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class PharmacistDirectory {
    public ArrayList<Pharmacist> pharmacistList;

    public PharmacistDirectory() {
        pharmacistList = new ArrayList();
    }

    public ArrayList<Pharmacist> getPharmacistList() {
        return pharmacistList;
    }
    
    public void removePharmacist(Pharmacist customer){
        pharmacistList.remove(customer);
    }
    
    public Pharmacist getPharmacist(String name){
        for(Pharmacist c : pharmacistList){
            if(c.getName().equals(name))
                return c;
        }
        return null;
    }
    
    public Pharmacist getPharmacist(int id){
        for(Pharmacist c : pharmacistList){
            if(c.getId() == id)
                return c;
        }
        return null;
    }
    
    public Pharmacist createPharmacist(String username, String pharmacyname, String pharmacyaddress){
        Pharmacist pharmacist = new Pharmacist();
        pharmacist.setUsername(username);
        pharmacist.setPharmacyname(pharmacyname);
        pharmacist.setPharmacyaddress(pharmacyaddress);
        pharmacist.setId(pharmacistList.size()+1);
        pharmacistList.add(pharmacist);
        return pharmacist;
    }
}
