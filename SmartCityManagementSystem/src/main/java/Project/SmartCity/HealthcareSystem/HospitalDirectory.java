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
public class HospitalDirectory {
    public ArrayList<Hospital> hospitalList;

    public HospitalDirectory() {
        hospitalList = new ArrayList();
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }
    public void removeHospital(Hospital hospital){
        hospitalList.remove(hospital);
    }
    
    public Hospital getHospital(String name){
        for(Hospital dm : hospitalList){
            if(dm.getName().equals(name))
                return dm;
        }
        return null;
    }
    
    public Hospital createHospital(String name, String[] location, String username){
        Hospital hospital = new Hospital();
        hospital.setName(name);
        hospital.setLocation(location);
        hospital.setUsername(username);
        hospital.setId(hospitalList.size()+1);
        hospitalList.add(hospital);
        return hospital;
    }
}
