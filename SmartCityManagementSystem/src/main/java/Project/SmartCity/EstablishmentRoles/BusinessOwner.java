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
public class BusinessOwner extends Person{
    public String username;
    public String businessName;
    public String businessType;
    public int businessOwnerID;
    
    public static int count = 1;

    public BusinessOwner(String businessName, String businessType) {
        this.businessName = businessName;
        this.businessType = businessType;
        
        this.businessOwnerID = count;
        count++;
    }
    
    public BusinessOwner() {
        this.businessOwnerID = count;
        this.businessName = "";
        this.businessType = "";
        count++;
    }

    public int getBusinessOwnerID() {
        return businessOwnerID;
    }

    public void setBusinessOwnerID(int businessOwnerID) {
        this.businessOwnerID = businessOwnerID;
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
   
//    public int getId() {
//        return id;
//    }
//    
//     public void setId(int id) {
//        this.id = id;
//    }
// 
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    
//    public String getName() {
//        return name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//    
//    @Override
//    public String toString() {
//        return name;
//    }
}
