/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.TransportationSystem;

import Project.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class TicketDirectory {
    public ArrayList<Ticket> ticketList;

    public TicketDirectory() {
        ticketList = new ArrayList();
    }

    public ArrayList<Ticket> getTicketList() {
        return ticketList;
    }
    
    public void removeTicket(Ticket tkt){
        ticketList.remove(tkt);
    }
    
    public Ticket getTicket(int id){
        for(Ticket c : ticketList){
            if(c.getId() == id)
                return c;
        }
        return null;
    }
    
    public Ticket createTicket(String mode, String vehiclenumber, String dateoftravel, String startlocation,String droplocation){
        Ticket ticket = new Ticket();
        ticket.setDateoftravel(dateoftravel);
        ticket.setDroplocation(droplocation);
        ticket.setMode(mode);
        ticket.setStartlocation(startlocation);
        ticket.setVehiclenumber(vehiclenumber);
        ticket.setId(ticketList.size()+1);
        ticketList.add(ticket);
        return ticket;
    }  
}
