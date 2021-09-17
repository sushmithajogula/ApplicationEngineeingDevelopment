/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.EstablishmentRoles;

import Project.Person.Person;

/**
 *
 * @author harooniqbal
 */
public class Manager extends Person {
    public int managerid;
    public String businessName;
    public String businessType;
    
    private static int count = 1;

    public Manager(String businessName, String businessType) {
        this.businessName = businessName;
        this.businessType = businessType;
        
        this.managerid = count;
        count++;
    }
    
    public Manager() {
        this.managerid = count;
        this.businessName = "";
        this.businessType = "";
        count++;
    }
    
    

  /*  public int getId() {
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

    public int getManagerid() {
        return managerid;
    }

    public void setManagerid(int managerid) {
        this.managerid = managerid;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
}
