package bankaccountapp;

public abstract class Account implements IRate {
    // abstract - we will not be able to create objects from the Account class, but we can create objects from classes that inherent from Account
    // super class; parent class
    // whatever is inside IRate will now be included in Account, Checking and Savings will have properties inside both Account and Interest Rate

    // list common properties for savings and checking accounts
    String name;
    String sSN;
    double balance;
    String accountNumber;
    double rate;

    // constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        System.out.println("NAME: " + name + " SSN: " + sSN + " BALANCE: $" + balance);
    }

    // list common methods (deposit, withdraw, transfer, show info)
}
