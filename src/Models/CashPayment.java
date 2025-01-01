package Models;

import Interface.Payment;

public class CashPayment extends Payment {

    @Override
    public boolean initiateTransaction() {
        //add your implementation here
        return false;
    }
}
