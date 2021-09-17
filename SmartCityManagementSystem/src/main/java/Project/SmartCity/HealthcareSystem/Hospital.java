/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.HealthcareSystem;

import Project.SmartCity.HealthcareRoles.DoctorDirectory;
import Project.SmartCity.HealthcareRoles.PatientDirectory;

/**
 *
 * @author harooniqbal
 */
public class Hospital {
    public int id;
    public String name;
    public String[] location;
    public String username;
    
    public DoctorDirectory doctorDirectory;
    public PatientDirectory patientDirectory;
    public AppointmentDirectory appointmentDirectory;
    
    public Hospital(){
        this.doctorDirectory = new DoctorDirectory();
        this.patientDirectory = new PatientDirectory();
        this.appointmentDirectory = new AppointmentDirectory();
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

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public AppointmentDirectory getAppointmentDirectory() {
        return appointmentDirectory;
    }

    public void setAppointmentDirectory(AppointmentDirectory appointmentDirectory) {
        this.appointmentDirectory = appointmentDirectory;
    }
}
