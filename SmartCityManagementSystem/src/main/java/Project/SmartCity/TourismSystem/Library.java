/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.TourismSystem;

/**
 *
 * @author harooniqbal
 */
public class Library {
    public int id;
    public String username;
    public String name;
    public String[] location;
    public String[] bookList;
    //EmployeeDirectory;
    public String cost;
    public int numberofvisits = 0;

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getNumberofvisits() {
        return numberofvisits;
    }

    public void setNumberofvisits(int numberofvisits) {
        this.numberofvisits = numberofvisits;
    }
    
    public Library(){
        
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

    public String[] getBookList() {
        return bookList;
    }

    public void setBookList(String[] bookList) {
        this.bookList = bookList;
    }
}
