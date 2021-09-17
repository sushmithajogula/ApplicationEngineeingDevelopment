/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.TourismSystem;

/**
 *
 * @author latis
 */
public class TourismSystemRating {
    public Integer TotalRating, Count;

    public Integer getTotalRating() {
        return TotalRating;
    }

    public void setTotalRating(int TotalRating) {
        this.TotalRating = TotalRating;
    }

    public Integer getCount() {
        return Count;
    }

    public void setCount(int Count) {
        this.Count = Count;
    }
    
    public TourismSystemRating(){
        TotalRating = 1;
        Count = 1;
    }
    
    public float AvgTourismSystemRating(){
        System.out.println("Inside Java - "+(TotalRating.floatValue()/Count.floatValue()));
        return TotalRating.floatValue()/Count.floatValue(); 
    }
}
