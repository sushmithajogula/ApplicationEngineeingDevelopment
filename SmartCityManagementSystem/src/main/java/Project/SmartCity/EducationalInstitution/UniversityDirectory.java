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
public class UniversityDirectory {
    public ArrayList<University> universityList;

    public UniversityDirectory() {
        universityList = new ArrayList();
    }

    public ArrayList<University> getUniversityList() {
        return universityList;
    }
    public void removeUniversity(University university){
        universityList.remove(university);
    }
    
    public University getUniversity(String name){
        for(University dm : universityList){
            if(dm.getName().equals(name))
                return dm;
        }
        return null;
    }
    
    public University createUniversity(String name, String[] location, String username){
        University university = new University();
        university.setName(name);
        university.setLocation(location);
        university.setUsername(username);
        university.setId(universityList.size()+1);
        universityList.add(university);
        return university;
    }
}
