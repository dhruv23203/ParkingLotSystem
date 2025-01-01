package Models;

import Interface.Account;
import Interface.ParkingSpot;

public class AdminAccount extends  Account {



    @Override
    public boolean resetPassword(){
        // add your implementation

        return false;

    }

    public boolean addParkingSpot(ParkingSpot spot){
        //add your own implementation
        return false;
    }

    public boolean addEntrance(Entrance entrance){
        //add your own implementation
        return false;
    }

    public boolean addExit(Exit exit){
        //add your own implementation
        return false;
    }

    public boolean addDisplayBoard(DisplayBoard board){
        //add your own implementation
        return false;

    }
}
