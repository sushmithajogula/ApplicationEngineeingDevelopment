/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.TransportationRoles;

import Project.Person.Person;
import Project.SmartCity.TransportationSystem.TicketDirectory;

/**
 *
 * @author harooniqbal
 */
public class Commuter extends Person {
    public int commuterid;
    public String username;
    
    public TicketDirectory ticketList;
    
    public static int count = 1;

    public Commuter() {
        this.commuterid = count;
        // this.tourismcompany = "";
        count++;
        this.ticketList = new TicketDirectory();
    }
    
    public Commuter(String mode, String tourismcompany) {
        //this.tourismcompany = tourismcompany;
        this.commuterid = count;
        count++;
    }

   /* public int getId() {
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
    }*/

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public TicketDirectory getTicketList() {
        return ticketList;
    }

    public void setTicketList(TicketDirectory ticketList) {
        this.ticketList = ticketList;
    }

    public int getCommuterid() {
        return commuterid;
    }

    public void setCommuterid(int commuterid) {
        this.commuterid = commuterid;
    }    
}
