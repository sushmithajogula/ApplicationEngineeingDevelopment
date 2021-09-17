/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.HealthcareRoles;

import Project.Person.Person;
import Project.SmartCity.HealthcareSystem.AppointmentDirectory;

/**
 *
 * @author harooniqbal
 */
public class Doctor extends Person {
    public int doctorid;
    public String username;
    public String specialty;
    public String hospitalname;
    public AppointmentDirectory applist;
    
    private static int count = 1;

    public Doctor() {
        this.doctorid = count;
        this.specialty = "";
        this.hospitalname = "";
        count++;
        applist = new AppointmentDirectory();
    }
    
    public Doctor(String hospitalname, String specialty) {
        this.specialty = specialty;
        this.hospitalname = hospitalname;
        this.doctorid = count;
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
    
    

 /*   public int getId() {
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

    public int getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(int doctorid) {
        this.doctorid = doctorid;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }
}
