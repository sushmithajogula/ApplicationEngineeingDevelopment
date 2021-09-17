/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.Establishment;

import Project.Employee.EmployeeDirectory;
import Project.SmartCity.EstablishmentRoles.BusinessOwnerDirectory;
import Project.SmartCity.EstablishmentRoles.ManagerDirectory;

/**
 *
 * @author harooniqbal
 */
public class Restaurant {
    public int id;
    public String name;
    public String[] location;
    public static int count = 1;
    public String username;
    public String revenue;
    public int rating=5;
    public int headcount; 
    
    public Menu menu;
    public BusinessOwnerDirectory businessOwnerDirectory;
    public ManagerDirectory managerDirectory;
    public EmployeeDirectory employeeDirectory;//EmployeeDirectory;
    public OrderDirectory orderDirectory;//OrderDirectory;
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Restaurant.count = count;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getHeadcount() {
        return headcount;
    }

    public void setHeadcount(int headcount) {
        this.headcount = headcount;
    }
    
    
    
    public Restaurant() {
        id = count;
        count++;
        this.menu = new Menu();
        this.managerDirectory = new ManagerDirectory();
        this.employeeDirectory = new EmployeeDirectory();
        this.orderDirectory = new OrderDirectory();
        this.businessOwnerDirectory = new BusinessOwnerDirectory();
        revenue = "0";
        headcount = 0;
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

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }
}
