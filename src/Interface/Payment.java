package Interface;

import constants.PaymentStatus;

import java.util.Date;

public abstract class Payment {

    private double amount;
    private PaymentStatus status;
    private Date timeStamp;
    private int transactionId;

    public abstract boolean initiateTransaction();
}
