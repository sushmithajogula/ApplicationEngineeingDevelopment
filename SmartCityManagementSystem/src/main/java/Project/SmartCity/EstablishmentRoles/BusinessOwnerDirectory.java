/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.EstablishmentRoles;

import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class BusinessOwnerDirectory {
    public ArrayList<BusinessOwner> businessOwnerList;

    public BusinessOwnerDirectory() {
        businessOwnerList = new ArrayList();
    }

    public ArrayList<BusinessOwner> getBusinessOwnerList() {
        return businessOwnerList;
    }
    
    public void removeBusinessOwner(BusinessOwner businessOwner){
        businessOwnerList.remove(businessOwner);
    }
    
    public BusinessOwner getBusinessOwner(String name){
        for(BusinessOwner c : businessOwnerList){
            if(c.getName().equals(name))
                return c;
        }
        return null;
    }

    public void setBusinessOwnerList(ArrayList<BusinessOwner> businessOwnerList) {
        this.businessOwnerList = businessOwnerList;
    }
        
    public BusinessOwner createBusinessOwner(String businessName, String businessType){
        BusinessOwner businessOwner = new BusinessOwner(businessName, businessType);
        businessOwner.setBusinessName(businessName);
        businessOwner.setBusinessType(businessType);
        businessOwner.setId(businessOwnerList.size()+1);
        businessOwnerList.add(businessOwner);
        return businessOwner;
    }
    
    public BusinessOwner createBusinessOwner(String username){
        BusinessOwner businessOwner = new BusinessOwner();
        businessOwner.setUsername(username);
        businessOwner.setId(businessOwnerList.size()+1);
        businessOwnerList.add(businessOwner);
        return businessOwner;
    }
}
