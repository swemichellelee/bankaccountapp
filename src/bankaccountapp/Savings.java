package bankaccountapp;

public class Savings extends Account {
    // List properties specific to the Savings account
   private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to initialize settings for the savings properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber =  "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    // Safety Deposit Box identified by a 3-digit number and accessed with a 4-digit code
    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    // List any methods specific to Savings account
    public void showInfo() {
        super.showInfo();
        System.out.println(
                "Your Savings Account Features" +
                        "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                        "\n Safety Deposit Key: " + safetyDepositBoxKey
        );

    }
}
