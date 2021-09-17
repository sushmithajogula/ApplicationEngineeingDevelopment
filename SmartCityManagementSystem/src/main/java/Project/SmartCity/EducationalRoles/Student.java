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
public class Student extends Person{
    
    public static int count = 1;
    public int studentID;
    public String institution;
    public ArrayList <String> courses;
    public double gpa = 0.0;
    public ArrayList <String> achievements;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public Student(String institution, ArrayList<String> courses) {
        this.institution = institution;
        this.courses = new ArrayList<>();
        this.courses = courses;
        studentID = count;
        count++;
    }
    
    public Student() {
        studentID = count;
        this.courses = new ArrayList<>();
        this.institution = "";
        count++;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }
    
    public void addCourse(String course){
        this.courses.add(course);
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
