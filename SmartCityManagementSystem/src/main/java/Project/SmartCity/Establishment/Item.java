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
public class Item {
    public int Id;
    public String name;
    public String cost;
    public String type;

    public Item(int id, String name,String cost, String type){
        this.Id = id;
        this.name = name;
         this.cost = cost;
          this.type = type;
    }

    public Item(){
        this.Id = 0;
        this.name = "";
        this.cost = "";
          this.type = "";
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    
}
