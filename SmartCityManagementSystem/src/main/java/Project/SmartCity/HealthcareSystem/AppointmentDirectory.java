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
public class AppointmentDirectory {
    public ArrayList<Appointment> appointmentList;
    
    public AppointmentDirectory() {
        appointmentList = new ArrayList();
    }

    public ArrayList<Appointment> getAppointmentList() {
        return appointmentList;
    }
    public void removeAppointment(Appointment appointment){
        appointmentList.remove(appointment);
    }
    
    public Appointment getAppointment(int id){
        for(Appointment dm : appointmentList){
            if(dm.getId() == id)
                return dm;
        }
        return null;
    }
    
    public Appointment createAppointment(String date, String[] symptoms){
        Appointment appointment = new Appointment();
        appointment.setId(appointmentList.size()+1);
        appointment.setDate(date);
        appointment.setSymptoms(symptoms);
        appointmentList.add(appointment);
        return appointment;
    }
}
