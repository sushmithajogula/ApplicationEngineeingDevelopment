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
public class Ticket {
    public String vehiclenumber;
    public int id;
    public String mode;
    public String dateoftravel;
    public String startlocation;
    public String droplocation;
//    public String ticketnumber;
    
    public static int count = 1;

    public Ticket() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }
    
 public void setId(int id) {
        this.id = id;
    }

    public String getVehiclenumber() {
        return vehiclenumber;
    }

    public void setVehiclenumber(String vehiclenumber) {
        this.vehiclenumber = vehiclenumber;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getDateoftravel() {
        return dateoftravel;
    }

    public void setDateoftravel(String dateoftravel) {
        this.dateoftravel = dateoftravel;
    }

    public String getStartlocation() {
        return startlocation;
    }

    public void setStartlocation(String startlocation) {
        this.startlocation = startlocation;
    }

    public String getDroplocation() {
        return droplocation;
    }

    public void setDroplocation(String droplocation) {
        this.droplocation = droplocation;
    }
}
