/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.Establishment;

import Project.Employee.EmployeeDirectory;
import Project.Job.JobDirectory;
import Project.SmartCity.EstablishmentRoles.BusinessOwnerDirectory;
import Project.SmartCity.EstablishmentRoles.ManagerDirectory;

/**
 *
 * @author harooniqbal
 */
public class JobOrganization {
    public int id;
    public String name;
    public String sector;
    public String username;
    public String[] location;
    
    public BusinessOwnerDirectory businessOwnerDirectory;
    public ManagerDirectory managerDirectory;
    public EmployeeDirectory employeeDirectory;
    public JobDirectory jobDirectory;
    
    public JobOrganization(){
        this.businessOwnerDirectory = new BusinessOwnerDirectory();
        this.employeeDirectory = new EmployeeDirectory();
        this.jobDirectory = new JobDirectory();
        this.managerDirectory = new ManagerDirectory();
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public JobDirectory getJobDirectory() {
        return jobDirectory;
    }

    public void setJobDirectory(JobDirectory jobDirectory) {
        this.jobDirectory = jobDirectory;
    }
    
    
}
