/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.HealthcareSystem;

import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class PharmacyDirectory {
    public ArrayList<Pharmacy> pharmacyList;

    public PharmacyDirectory() {
        pharmacyList = new ArrayList();
    }

    public ArrayList<Pharmacy> getPharmacyList() {
        return pharmacyList;
    }
    public void removePharmacy(Pharmacy pharmacy){
        pharmacyList.remove(pharmacy);
    }
    
    public Pharmacy getPharmacy(String name){
        for(Pharmacy dm : pharmacyList){
            if(dm.getName().equals(name))
                return dm;
        }
        return null;
    }
    
    public Pharmacy createPharmacy(String name, String[] location, String username){
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.setName(name);
        pharmacy.setLocation(location);
        pharmacy.setUsername(username);
        pharmacy.setId(pharmacyList.size()+1);
        pharmacyList.add(pharmacy);
        return pharmacy;
    }
}
