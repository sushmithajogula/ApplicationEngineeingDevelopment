/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.Establishment;

import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class JobOrganizationDirectory {
    public ArrayList<JobOrganization> jobOrganizationList;

    public JobOrganizationDirectory() {
        jobOrganizationList = new ArrayList();
    }

    public ArrayList<JobOrganization> getJobOrganizationList() {
        return jobOrganizationList;
    }
    public void removeJobOrganization(JobOrganization jobOrganization){
        jobOrganizationList.remove(jobOrganization);
    }
    
    public JobOrganization getJobOrganization(String name){
        for(JobOrganization dm : jobOrganizationList){
            if(dm.getName().equals(name))
                return dm;
        }
        return null;
    }
    
    public JobOrganization createJobOrganization(String name, String sector, String[] location, String username){
        JobOrganization jobOrganization = new JobOrganization();
        jobOrganization.setName(name);
        jobOrganization.setSector(sector);
        jobOrganization.setLocation(location);
        jobOrganization.setUsername(username);
        jobOrganization.setId(jobOrganizationList.size()+1);
        jobOrganizationList.add(jobOrganization);
        return jobOrganization;
    }
}
