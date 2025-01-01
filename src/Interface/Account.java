package Interface;

import Models.Person;
import constants.AccountStatus;

public abstract class Account {
    private String username;
    private String password;
    private Person person;

    private AccountStatus status;

    public abstract boolean resetPassword();

}
