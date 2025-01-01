import Models.*;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotSystem {
    private int maxCapacity;
    private int id;
    private String name;
    private String address;

    private Map<String , Entrance> entrance;
    private Map<String , Exit> exit;
    private ParkingRate parkingRate;

    private Map<String , DisplayBoard> displayBoard;
    private Map<String , ParkingTicket> parkingTickets;






    public ParkingLotSystem() {

    }
}
