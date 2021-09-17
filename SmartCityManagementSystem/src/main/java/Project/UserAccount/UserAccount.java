/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.UserAccount;

import Project.Employee.Employee;
import Project.Role.Role;
import Project.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    public String username;
    public String password;
    public Employee employee;
    public Role role;
    public WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    @Override
    public String toString() {
        return username;
    }
}