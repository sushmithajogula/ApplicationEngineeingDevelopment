/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Employee;

import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class EmployerDirectory {
    private ArrayList<Employer> employerList;

    public EmployerDirectory() {
        employerList = new ArrayList();
    }

    public ArrayList<Employer> getEmployerList() {
        return employerList;
    }
    
    public void removeEmployer(Employer customer){
        employerList.remove(customer);
    }
    
    public Employer getEmployer(String name){
        for(Employer c : employerList){
            if(c.getName().equals(name))
                return c;
        }
        return null;
    }
    
    public Employer createEmployer(String name, String address){
        Employer employer = new Employer();
        employer.setName(name);
        employer.setAddress(address);
        employer.setId(employerList.size()+1);
        employerList.add(employer);
        return employer;
    }
}
