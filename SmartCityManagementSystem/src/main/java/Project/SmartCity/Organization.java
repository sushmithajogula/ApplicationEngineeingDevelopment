/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity;

import Project.Employee.EmployeeDirectory;
import Project.Role.Role;
import Project.UserAccount.UserAccountDirectory;
import Project.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Okami
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;

    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin"),
        BusinessOwner("BusinessOwner"),
        Commuter("Commuter"),
        Customer("Customer"),
        DeliverMan("DeliverMan"),
        Doctor("Doctor"),
        Faculty("Faculty"),
        Manager("Manager"),
        Patient("Patient"),
        Pharmacist("Pharmacist"),
        Student("Student"),
        SysAdmin("Sysadmin"),
        Tourist("Tourist"),
        TourGuide("TourGuide"),
        TheatreAdmin("TheatreAdmin"),
        ShopAdmin("ShopAdmin"),
        GeneralUser("GeneralUser");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    public Organization(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}