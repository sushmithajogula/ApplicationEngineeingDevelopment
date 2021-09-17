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
public class FacultyDirectory {
    public ArrayList<Faculty> facultyList;

    public FacultyDirectory() {
        facultyList = new ArrayList();
    }

    public ArrayList<Faculty> getFacultyList() {
        return facultyList;
    }
    
    public void removeFaculty(Faculty customer){
        facultyList.remove(customer);
    }
    
    public Faculty getFaculty(String name){
        for(Faculty c : facultyList){
            if(c.getName().equals(name))
                return c;
        }
        return null;
    }
    
    public Faculty createFaculty(String institution, String subject, String experience,String achievements, String publications, ArrayList<String> interestareas){
        Faculty faculty = new Faculty(institution, subject, experience,achievements,publications,interestareas);
        faculty.setInstitution(institution);
        faculty.setSubject(subject);
        faculty.setExperience(experience);
        faculty.setAchievements(achievements);
        faculty.setPublications(publications);
        faculty.setInterestareas(interestareas);
        faculty.setId(facultyList.size()+1);
        facultyList.add(faculty);
        return faculty;
    }
    
    public Faculty createFaculty(){
        Faculty faculty = new Faculty();
        faculty.setId(facultyList.size()+1);
        facultyList.add(faculty);
        return faculty;
    }
}
