package bankaccountapp;

public abstract class Account implements IRate {
    // Common properties for Savings and Checking accounts
    String name;
    String sSN;
    double balance;
    static int index = 10000;
    String accountNumber;
    double rate;

    // Constructor to set base properties and initialize the Account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        // Set Account Number
        // Counter for 5 Digit Unique ID
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();

    // Last two digits of SSN
    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
        // Unique 5 Digit ID
        int uniqueID = index;
        // Random 3 Digit Code
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    // List common methods (deposit, withdraw, transfer, show info)
    public void showInfo() {
        System.out.println(
                "NAME: " + name +
                "\n ACCOUNT NUMBER: " + accountNumber +
                "\n BALANCE: " + balance +
                "\n RATE: " + rate + "%"
        );
    }
}
