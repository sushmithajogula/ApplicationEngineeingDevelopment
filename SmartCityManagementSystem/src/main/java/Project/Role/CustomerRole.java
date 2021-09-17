/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Role;

import Project.SmartCity.SmartCity;

import Project.UserAccount.UserAccount;
import UI.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class CustomerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, SmartCity business) {
        return new CustomerAreaJPanel(userProcessContainer, account, business);
    }
    
    
}
