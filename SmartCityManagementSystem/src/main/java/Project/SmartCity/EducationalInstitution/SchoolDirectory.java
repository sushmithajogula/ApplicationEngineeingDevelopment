/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.EducationalInstitution;

import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class SchoolDirectory {
    public ArrayList<School> schoolList;

    public SchoolDirectory() {
        schoolList = new ArrayList();
    }

    public ArrayList<School> getSchoolList() {
        return schoolList;
    }
    public void removeSchool(School school){
        schoolList.remove(school);
    }
    
    public School getSchool(String name){
        for(School dm : schoolList){
            if(dm.getName().equals(name))
                return dm;
        }
        return null;
    }
    
    public School createSchool(String name, String[] location, String username){
        School school = new School();
        school.setName(name);
        school.setLocation(location);
        school.setUsername(username);
        school.setId(schoolList.size()+1);
        schoolList.add(school);
        return school;
    }
}
