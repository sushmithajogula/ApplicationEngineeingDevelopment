/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.EducationalRoles;

import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class StudentDirectory {
    public ArrayList<Student> studentList;

    public StudentDirectory() {
        studentList = new ArrayList();
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    
    public void removeStudent(Student customer){
        studentList.remove(customer);
    }
    
    public Student getStudent(String name){
        for(Student c : studentList){
            if(c.getName().equals(name))
                return c;
        }
        return null;
    }
    
    public Student createStudent(String institution, ArrayList<String> courses){
        Student student = new Student(institution, courses);
        student.setInstitution(institution);
        student.setCourses(courses);
        student.setId(studentList.size()+1);
        studentList.add(student);
        return student;
    }
    
    public Student createStudent(){
        Student student = new Student();
        student.setId(studentList.size()+1);
        studentList.add(student);
        return student;
    }
}