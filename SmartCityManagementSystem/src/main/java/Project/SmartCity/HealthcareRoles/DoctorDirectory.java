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
public class DoctorDirectory {
    public ArrayList<Doctor> doctorList;

    public DoctorDirectory() {
        doctorList = new ArrayList();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }
    
    public void removeDoctor(Doctor customer){
        doctorList.remove(customer);
    }
    
    public Doctor getDoctor(String name){
        for(Doctor c : doctorList){
            if(c.getName().equals(name))
                return c;
        }
        return null;
    }
    
    public Doctor createDoctor(String username, String specialty, String hospitalname){
        Doctor doctor = new Doctor();
        doctor.setSpecialty(specialty);
        doctor.setUsername(username);
        doctor.setHospitalname(hospitalname);
        doctor.setId(doctorList.size()+1);
        doctorList.add(doctor);
        return doctor;
    }
}
