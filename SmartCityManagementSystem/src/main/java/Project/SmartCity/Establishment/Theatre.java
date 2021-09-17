/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.Establishment;

import Project.Employee.EmployeeDirectory;
import Project.SmartCity.EstablishmentRoles.BusinessOwnerDirectory;
import Project.SmartCity.EstablishmentRoles.ManagerDirectory;
import java.util.HashMap;

/**
 *
 * @author Okami
 */
public class Theatre {
    public int Id;
    public String name;
    public String[] location;
    public HashMap<String, Integer> movies;
    public String username;
    public String revenue;
    public int rating=5;
    public int headcount; 
    
    public BusinessOwnerDirectory businessOwnerDirectory;
    public ManagerDirectory managerDirectory;
    public ItemDirectory itemDirectory;//ItemDirectory;
    public EmployeeDirectory employeeDirectory;//EmployeeDirectory;
    
    public Theatre(){
        this.managerDirectory = new ManagerDirectory();
        this.itemDirectory = new ItemDirectory();
        this.employeeDirectory = new EmployeeDirectory();
        this.businessOwnerDirectory = new BusinessOwnerDirectory();
        this.movies =  new HashMap<>();
        this.movies.put("Avengers", 20);
        this.movies.put("Avatar", 15);
        revenue = "0";
        headcount = 0;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }

    public HashMap<String, Integer> getMovies() {
        return movies;
    }

    public void setMovies(HashMap<String, Integer> movies) {
        this.movies = movies;
    }

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

    public BusinessOwnerDirectory getBusinessOwnerDirectory() {
        return businessOwnerDirectory;
    }

    public void setBusinessOwnerDirectory(BusinessOwnerDirectory businessOwnerDirectory) {
        this.businessOwnerDirectory = businessOwnerDirectory;
    }

    public ManagerDirectory getManagerDirectory() {
        return managerDirectory;
    }

    public void setManagerDirectory(ManagerDirectory managerDirectory) {
        this.managerDirectory = managerDirectory;
    }

    public ItemDirectory getItemDirectory() {
        return itemDirectory;
    }

    public void setItemDirectory(ItemDirectory itemDirectory) {
        this.itemDirectory = itemDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    
}
