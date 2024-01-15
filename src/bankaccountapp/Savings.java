package bankaccountapp;

public class Savings extends Account {
    // child class
    // list properties specific to the Savings account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // constructor to initialize settings for the savings properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        System.out.println("NEW SAVINGS ACCOUNT");

    }

    // list any methods specific to savings account
}
