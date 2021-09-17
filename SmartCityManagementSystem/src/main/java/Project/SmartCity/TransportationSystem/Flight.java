/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.TransportationSystem;

/**
 *
 * @author harooniqbal
 */
public class Flight {
    public int id;
    public String username;
    public String number;
    public String startLocation;
    public String dropLocation;
    public int UserCount;

    public int getUserCount() {
        return UserCount;
    }

    public void setUserCount(int UserCount) {
        this.UserCount = UserCount;
    }
    
    public Flight() {
        UserCount = 0;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }
}
