/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.TourismSystem;

import java.util.ArrayList;

/**
 *
 * @author Okami
 */
public class TourPackageDirectory {
    public ArrayList<TourPackage> tourPackageList;
    
    public TourPackageDirectory(){
        tourPackageList = new ArrayList();
    }
    
    public ArrayList<TourPackage> getTourPackageList() {
        return tourPackageList;
    }
    public void removeTourPackage(TourPackage museum){
        tourPackageList.remove(museum);
    }
    
    public TourPackage getTourPackage(int id){
        for(TourPackage dm : tourPackageList){
            if(dm.getId() == id)
                return dm;
        }
        return null;
    }
    
    public TourPackage createTourPackage(String cost, ArrayList<String> places, String date){
        TourPackage tourPackage = new TourPackage();
        tourPackage.setCost(cost);
        tourPackage.setPlaces(places);
        tourPackage.setDate(date);
        tourPackage.setId(tourPackageList.size()+1);
        tourPackageList.add(tourPackage);
        return tourPackage;
    }
}
