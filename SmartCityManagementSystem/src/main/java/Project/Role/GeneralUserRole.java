package Project.Role;

import Project.SmartCity.SmartCity;

import Project.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.FacultyRole.FacultyWorkAreaJPanel;
import UI.GeneralUserRole.GeneralUserRoleWorkAreaJPanel;

/**
 *
 * @author harold
 */
public class GeneralUserRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, SmartCity business) {
        return new GeneralUserRoleWorkAreaJPanel(userProcessContainer,account,business);//To change body of generated methods, choose Tools | Templates.
    }
    
}