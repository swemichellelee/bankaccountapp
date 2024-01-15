package bankaccountapp;

public class Checking extends Account {
    // child class
    // list properties specific to a Checking account
    int debitCardNumber;
    int debitCardPIN;

    // constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        System.out.println("NEW CHECKING ACCOUNT");
    }

    // list any method specific to the Checking account

}
