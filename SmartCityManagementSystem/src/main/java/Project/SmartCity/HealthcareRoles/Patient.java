/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.HealthcareRoles;

import Project.Person.Person;
import Project.SmartCity.HealthcareSystem.AppointmentDirectory;
import Project.SmartCity.HealthcareSystem.PrescriptionDirectory;

/**
 *
 * @author harooniqbal
 */
public class Patient extends Person{
    public int patientid;
    public String username;
    public String patientage;
    public String diagnosis;
    public AppointmentDirectory applist;
    public PrescriptionDirectory presdirectory;
    public static int count = 1;

    public Patient() {
        this.patientid = count;
        this.patientage = "";
        this.diagnosis = "";
        count++;
        applist = new AppointmentDirectory();
         presdirectory = new PrescriptionDirectory();
    }
    
    public Patient(String patientage, String diagnosis) {
        this.patientage = patientage;
        this.diagnosis = diagnosis;
        this.patientid = count;
        count++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public AppointmentDirectory getApplist() {
        return applist;
    }

    public void setApplist(AppointmentDirectory applist) {
        this.applist = applist;
    }

    public PrescriptionDirectory getPresdirectory() {
        return presdirectory;
    }

    public void setPresdirectory(PrescriptionDirectory presdirectory) {
        this.presdirectory = presdirectory;
    }

    
    
   /* public int getId() {
        return id;
    }
    
 public void setId(int id) {
        this.id = id;
    }
 
    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return name;
    }*/

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public String getPatientage() {
        return patientage;
    }

    public void setPatientage(String patientage) {
        this.patientage = patientage;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    
    
}
