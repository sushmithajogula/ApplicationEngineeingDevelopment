/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.HealthcareSystem;

import Project.SmartCity.HealthcareRoles.PatientDirectory;
import Project.SmartCity.HealthcareRoles.PharmacistDirectory;

/**
 *
 * @author harooniqbal
 */
public class Pharmacy {
    public int id;
    public String name;
    public String[] location;
    public String username;
    
    public PatientDirectory patientDirectory;
    public PharmacistDirectory pharmacistDirectory;
    public PrescriptionDirectory prescriptionDirectory;
    
    public Pharmacy(){
        patientDirectory = new PatientDirectory();
        pharmacistDirectory = new PharmacistDirectory();
        prescriptionDirectory = new PrescriptionDirectory();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public PharmacistDirectory getPharmacistDirectory() {
        return pharmacistDirectory;
    }

    public void setPharmacistDirectory(PharmacistDirectory pharmacistDirectory) {
        this.pharmacistDirectory = pharmacistDirectory;
    }

    public PrescriptionDirectory getPrescriptionDirectory() {
        return prescriptionDirectory;
    }

    public void setPrescriptionDirectory(PrescriptionDirectory prescriptionDirectory) {
        this.prescriptionDirectory = prescriptionDirectory;
    }
   
}
