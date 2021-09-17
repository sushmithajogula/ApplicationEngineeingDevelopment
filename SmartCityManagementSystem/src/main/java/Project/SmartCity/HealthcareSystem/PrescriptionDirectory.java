/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.HealthcareSystem;

import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class PrescriptionDirectory {
    public ArrayList<Prescription> prescriptionList;
    
    public PrescriptionDirectory() {
        this.prescriptionList = new ArrayList();
    }
    
    public ArrayList<Prescription> getPrescriptionList() {
        return prescriptionList;
    }
    public void removePrescription(Prescription prescription){
        prescriptionList.remove(prescription);
    }
    
    public Prescription getPrescription(int id){
        for(Prescription dm : prescriptionList){
            if(dm.getId()== id)
                return dm;
        }
        return null;
    }
    
    public Prescription createPrescription(String[] drugs){
        Prescription prescription = new Prescription();
        prescription.setDrugs(drugs);
        prescription.setId(prescriptionList.size()+1);
        prescriptionList.add(prescription);
        return prescription;
    }
}
