package bankaccountapp;

public abstract class Account implements IRate {
    // Common properties for Savings and Checking accounts
    private String name;
    private String sSN;
    private double balance;
    private static int index = 10000;
    protected String accountNumber;
    protected double rate;

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

    public void compound() {
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();
    }

    // List common methods - transactions
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing $ " + amount);
        printBalance();
    }
    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing $ " + amount);
        printBalance();
    }
    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transferring $ " + amount + " to " + toWhere);
        printBalance();
    }
    public void printBalance() {
        System.out.println("Your balance is now: $" + balance);
    }

    public void showInfo() {
        System.out.println(
                "NAME: " + name +
                "\n ACCOUNT NUMBER: " + accountNumber +
                "\n BALANCE: " + balance +
                "\n RATE: " + rate + "%"
        );
    }
}
