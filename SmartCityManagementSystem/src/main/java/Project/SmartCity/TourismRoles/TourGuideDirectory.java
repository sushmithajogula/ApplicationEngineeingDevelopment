/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.TourismRoles;

import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class TourGuideDirectory {
    public ArrayList<TourGuide> tourGuideList;

    public TourGuideDirectory() {
        tourGuideList = new ArrayList();
    }

    public ArrayList<TourGuide> getTourGuideList() {
        return tourGuideList;
    }
    
    public void removeTourGuide(TourGuide customer){
        tourGuideList.remove(customer);
    }
    
    public TourGuide getTourGuide(String name){
        for(TourGuide c : tourGuideList){
            if(c.getName().equals(name))
                return c;
        }
        return null;
    }
    
    public TourGuide getTourGuide(int id){
        for(TourGuide c : tourGuideList){
            if(c.getTouristguideid() == id)
                return c;
        }
        return null;
    }
    
    public TourGuide createTourGuide(String username, String experience, String tourismcompany){
        TourGuide tourGuide = new TourGuide();
        tourGuide.setUsername(username);
        tourGuide.setExperience(experience);
        tourGuide.setTourismcompany(tourismcompany);
        tourGuide.setId(tourGuideList.size()+1);
        tourGuideList.add(tourGuide);
        return tourGuide;
    }
}
