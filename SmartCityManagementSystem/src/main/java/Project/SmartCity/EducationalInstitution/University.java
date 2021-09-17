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
public class University {
    public int Id;
    public String name;
    public String[] location;
    public String username;
    public ArrayList<String> departments;
    public ArrayList<String> majors;
    public ArrayList<String> courses;
    public String costpercourse;
    public ArrayList<String> degrees;

    public StudentDirectory studentDirectory;
    public FacultyDirectory facultyDirectory;
    public String revenue;
    
    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }
    
    public University() {
        this.studentDirectory = new StudentDirectory();
        this.facultyDirectory = new FacultyDirectory();
    }

    public ArrayList<String> getDegrees() {
        return degrees;
    }

    public void setDegrees(ArrayList<String> degrees) {
        this.degrees = degrees;
    }

    public ArrayList<String> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<String> departments) {
        this.departments = departments;
    }

    public ArrayList<String> getMajors() {
        return majors;
    }

    public void setMajors(ArrayList<String> majors) {
        this.majors = majors;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public String getCostpercourse() {
        return costpercourse;
    }

    public void setCostpercourse(String costpercourse) {
        this.costpercourse = costpercourse;
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
