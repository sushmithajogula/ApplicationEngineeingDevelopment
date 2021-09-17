/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Role;

import Project.SmartCity.SmartCity;

import Project.UserAccount.UserAccount;
import UI.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, SmartCity system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system, account);
    }
    
}
