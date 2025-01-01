package Models;

import Interface.ParkingSpot;

public class Motorcycle extends ParkingSpot {
    @Override
    public boolean getIsFree() {
        //add your own implementation
        return false;
    }
}
