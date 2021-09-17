/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.Establishment;

/**
 *
 * @author harooniqbal
 */
public class MenuItem {
    public int Id;
    public String name;
    public String cal;
    public String cost;
    public String type;
    
    public MenuItem(int id, String name,String cost, String cal,String type){
        this.Id = id;
        this.name = name;
         this.cost = cost;
          this.cal = cal;
          this.type = type;
          
    }

    public MenuItem(){
        this.Id = 0;
        this.name = "";
        this.cost = "";
          this.cal = "";
          this.type = "";
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCal() {
        return cal;
    }

    public void setCal(String cal) {
        this.cal = cal;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
