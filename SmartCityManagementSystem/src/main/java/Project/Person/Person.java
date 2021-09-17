/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Person;

/**
 *
 * @author harooniqbal
 */
public class Person {
    public String name;
    public int id;
    public String address;
    public String email;
    public String phone;
    public String picPath;
    
    private static int count = 1;

    public Person() {
        id = count;
        count++;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }
    
 public void setId(int id) {
        this.id = id;
    }
 
    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
