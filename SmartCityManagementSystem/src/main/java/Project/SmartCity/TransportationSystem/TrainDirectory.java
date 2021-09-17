/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.TransportationSystem;

import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class TrainDirectory {
    public ArrayList<Train> trainList;

    public TrainDirectory() {
        trainList = new ArrayList();
    }

    public ArrayList<Train> getTrainList() {
        return trainList;
    }
    public void removeTrain(Train train){
        trainList.remove(train);
    }
    
    public Train getTrain(int id){
        for(Train dm : trainList){
            if(dm.getId() == id)
                return dm;
        }
        return null;
    }
    
    public Train createTrain(String number, String startLocation, String dropLocation, String username){
        Train train = new Train();
        train.setNumber(number);
        train.setStartLocation(startLocation);
        train.setDropLocation(dropLocation);
        train.setUsername(username);
        train.setId(trainList.size()+1);
        trainList.add(train);
        return train;
    }
}
