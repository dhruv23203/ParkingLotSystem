package Models;

import Interface.ParkingSpot;

public class Compact extends ParkingSpot {
    @Override
    public boolean getIsFree() {
        //add your own implementation
        return false;
    }
}
