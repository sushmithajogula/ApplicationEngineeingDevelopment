/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.HealthcareSystem;

/**
 *
 * @author harooniqbal
 */
public class Prescription {
    public int id;
    public String[] drugs;
    public String status = "Active";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Prescription(){
        drugs = new String[20];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getDrugs() {
        return drugs;
    }

    public void setDrugs(String[] drugs) {
        this.drugs = drugs;
    }
}
