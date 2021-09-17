/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.TourismRoles;

import Project.Person.Person;
import Project.SmartCity.TourismSystem.TourPackageDirectory;

/**
 *
 * @author harooniqbal
 */
public class Tourist extends Person{
    public int touristid;
    public String country;
    public String username;
    public String tourismcompany;
    public TourPackageDirectory tourPackageDirectory;
    public static int count = 1;

    public Tourist() {
        this.touristid = count;
        this.country = "";
        this.tourismcompany = "";
        count++;
        this.tourPackageDirectory = new TourPackageDirectory();
    }
    
    public Tourist(String country, String tourismcompany) {
        this.country = country;
        this.tourismcompany = tourismcompany;
        this.touristid = count;
        count++;
        this.tourPackageDirectory = new TourPackageDirectory();
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

    public int getTouristid() {
        return touristid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setTouristid(int touristid) {
        this.touristid = touristid;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTourismcompany() {
        return tourismcompany;
    }

    public void setTourismcompany(String tourismcompany) {
        this.tourismcompany = tourismcompany;
    }

    public TourPackageDirectory getTourPackageDirectory() {
        return tourPackageDirectory;
    }

    public void setTourPackageDirectory(TourPackageDirectory tourPackageDirectory) {
        this.tourPackageDirectory = tourPackageDirectory;
    }
}
