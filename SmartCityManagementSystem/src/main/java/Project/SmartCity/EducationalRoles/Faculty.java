/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.EducationalRoles;

import Project.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class Faculty extends Person{

    public static int count = 1;
    public int facultyID;
    public String institution;
    public String subject;
    public String experience;
    public String achievements;
    public String publications;
    public ArrayList<String> interestareas;
    
    
    public Faculty(String institution, String subject, String experience, String achievements, String publications, ArrayList<String> interestareas) {
        this.institution = institution;
        this.subject = subject;
        this.experience = experience;
        this.achievements = achievements;
        this.publications = publications;
        this.interestareas = new ArrayList<String>();
        facultyID = count;
        count++;
    }
    
    public Faculty() {
        this.facultyID = count;
        this.experience = "";
        this.institution = "";
        this.subject = "";
        this.achievements = "";
        this.publications = "";
        this.interestareas = new ArrayList<String>();
        count++;
    }

    public ArrayList<String> getInterestareas() {
        return interestareas;
    }

    public void setInterestareas(ArrayList<String> interestareas) {
        this.interestareas = interestareas;
    }

    
    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    public String getPublications() {
        return publications;
    }

    public void setPublications(String publications) {
        this.publications = publications;
    }
    

    public int getFacultyID() {
        return facultyID;
    }

    public void setFacultyID(int facultyID) {
        this.facultyID = facultyID;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
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
