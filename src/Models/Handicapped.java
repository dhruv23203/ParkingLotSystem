package Models;

import Interface.ParkingSpot;

public class Handicapped extends ParkingSpot {
    @Override
    public boolean getIsFree() {
        // add your own implementation here
        return false;
    }
}
