package Models;

import Interface.Payment;
import Interface.Vehicle;
import constants.PaymentStatus;

import java.util.Date;

public class ParkingTicket {

    private int ticketNo;
    private Date entryTimeStamp;
    private double amount;
    private PaymentStatus status;


    private Vehicle vehicle;
    private Entrance entrance;
    private Payment payment;
    private Exit exit;


}
