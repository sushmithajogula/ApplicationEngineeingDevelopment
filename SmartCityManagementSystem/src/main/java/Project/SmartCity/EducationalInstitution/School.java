/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.EducationalInstitution;

import Project.SmartCity.EducationalRoles.FacultyDirectory;
import Project.SmartCity.EducationalRoles.StudentDirectory;
import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class School {
    public int Id;
    public String name;
    public String[] location;
    public String feepersubject;
    public ArrayList<String> subjects;
    public String division;
    public String username;
    public StudentDirectory studentDirectory;
    public FacultyDirectory facultyDirectory;
    public String revenue;
    
    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
    

    public String getFeepersubject() {
        return feepersubject;
    }

    public void setFeepersubject(String feepersubject) {
        this.feepersubject = feepersubject;
    }
    

    
    
    public School() {
        this.studentDirectory = new StudentDirectory();
        this.facultyDirectory = new FacultyDirectory();
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public FacultyDirectory getFacultyDirectory() {
        return facultyDirectory;
    }

    public void setFacultyDirectory(FacultyDirectory facultyDirectory) {
        this.facultyDirectory = facultyDirectory;
    }
}
