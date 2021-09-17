/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.HealthcareRoles;

import Project.Person.Person;
import Project.SmartCity.HealthcareSystem.PrescriptionDirectory;

/**
 *
 * @author harooniqbal
 */
public class Pharmacist extends Person {
    public int pharmacistid;
    public String pharmacyname;
    public String pharmacyaddress;
    public String username;
    public PrescriptionDirectory presdirectory;
    
    private static int count = 1;

    public Pharmacist() {
        this.pharmacistid = count;
        this.pharmacyname = "";
        this.pharmacyaddress = "";
        count++;
        presdirectory = new PrescriptionDirectory();
    }
    
    public Pharmacist(String pharmacyname, String pharmacyaddress) {
        this.pharmacyname = pharmacyname;
        this.pharmacyaddress = pharmacyaddress;
        this.pharmacistid = count;
        count++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public int getPharmacistid() {
        return pharmacistid;
    }

    public void setPharmacistid(int pharmacistid) {
        this.pharmacistid = pharmacistid;
    }

    public String getPharmacyname() {
        return pharmacyname;
    }

    public void setPharmacyname(String pharmacyname) {
        this.pharmacyname = pharmacyname;
    }

    public String getPharmacyaddress() {
        return pharmacyaddress;
    }

    public void setPharmacyaddress(String pharmacyaddress) {
        this.pharmacyaddress = pharmacyaddress;
    }

    public PrescriptionDirectory getPresdirectory() {
        return presdirectory;
    }

    public void setPresdirectory(PrescriptionDirectory presdirectory) {
        this.presdirectory = presdirectory;
    }
    
}
