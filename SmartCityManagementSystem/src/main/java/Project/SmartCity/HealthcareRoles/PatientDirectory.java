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
public class PatientDirectory {
    public ArrayList<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }
    
    public void removePatient(Patient customer){
        patientList.remove(customer);
    }
    
    public Patient getPatient(String name){
        for(Patient c : patientList){
            if(c.getName().equals(name))
                return c;
        }
        return null;
    }
    
    public Patient createPatient(String username, String patientage, String diagnosis){
        Patient patient = new Patient();
        patient.setUsername(username);
        patient.setPatientage(patientage);
        patient.setDiagnosis(diagnosis);
        patient.setId(patientList.size()+1);
        patientList.add(patient);
        return patient;
    }
}
