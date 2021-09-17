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
public class TourGuide extends Person{
    public int touristguideid;
    public String experience;
    public String username;
    public String tourismcompany;
    public TourPackageDirectory tourPackageDirectory;
    
    public static int count = 1;

    public TourGuide() {
        this.touristguideid = count;
        this.experience = "";
        this.tourismcompany = "";
        count++;
        this.tourPackageDirectory = new TourPackageDirectory();
    }
    
    public TourGuide(String experience, String tourismcompany) {
        this.experience = experience;
        this.tourismcompany = tourismcompany;
        this.touristguideid = count;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public int getTouristguideid() {
        return touristguideid;
    }

    public void setTouristguideid(int touristguideid) {
        this.touristguideid = touristguideid;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
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
