/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.EstablishmentRoles;

import Project.Person.Person;
import Project.SmartCity.Establishment.OrderDirectory;
import Project.SmartCity.Establishment.ShopOrderDirectory;
import java.util.HashMap;

/**
 *
 * @author Okami
 */
public class Customer {
    public String username;
    public String name;
    public int id;
    
    public static int count = 1;

    public ShopOrderDirectory shopOrderDirectory;
    public OrderDirectory orderDirectory;
    public HashMap<String, Integer> theatreDirectory;
    
    public Customer(String name, String username) {
        this.name = name;
        this.id = count;
        this.username = username;
        count++;
        this.shopOrderDirectory = new ShopOrderDirectory();
        this.orderDirectory = new OrderDirectory();
        this.theatreDirectory = new HashMap<>();
    }
    
    public Customer() {
        this.id = count;
        this.name = "";
        this.username = "";
        count++;
        this.shopOrderDirectory = new ShopOrderDirectory();
        this.orderDirectory = new OrderDirectory();
        this.theatreDirectory = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public ShopOrderDirectory getShopOrderDirectory() {
        return shopOrderDirectory;
    }

    public void setShopOrderDirectory(ShopOrderDirectory shopOrderDirectory) {
        this.shopOrderDirectory = shopOrderDirectory;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public HashMap<String, Integer> getTheatreDirectory() {
        return theatreDirectory;
    }

    public void setTheatreDirectory(HashMap<String, Integer> movies) {
        this.theatreDirectory = movies;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
