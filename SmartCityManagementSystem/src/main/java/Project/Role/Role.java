/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Role;

import Project.SmartCity.SmartCity;

import Project.SmartCity.Organization;
import Project.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        BusinessOwner("BusinessOwner"),
        Commuter("Commuter"),
        Customer("Customer"),
        DeliverMan("DeliverMan"),
        Doctor("Doctor"),
        Faculty("Faculty"),
        Manager("Manager"),
        Patient("Patient"),
        Pharmacist("Pharmacist"),
        Student("Student"),
        SysAdmin("Sysadmin"),
        Tourist("Tourist"),
        TourGuide("TourGuide"),
        TheatreAdmin("TheatreAdmin"),
        ShopAdmin("ShopAdmin"),
        GeneralUser("GeneralUser");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            SmartCity business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}