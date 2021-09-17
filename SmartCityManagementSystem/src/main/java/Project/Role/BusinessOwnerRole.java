/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Role;

import Project.SmartCity.SmartCity;

import Project.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.BusinessOwnerRole.BusinessOwnerRoleWorkAreaJPanel;

/**
 *
 * @author harold
 */
public class BusinessOwnerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, SmartCity business) {
        return new BusinessOwnerRoleWorkAreaJPanel(userProcessContainer,account,business);//To change body of generated methods, choose Tools | Templates.
    }
    
}

