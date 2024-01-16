package bankaccountapp;

import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        String file = "/Users/michellelee/desktop/NewBankAccounts.csv";

        // Unit Testing --
//        Checking chkacc1 = new Checking("Taylor Swift", "123456789", 1500);
//        Savings savacc1 = new Savings("Travis Kelce", "234567891", 2500);
//        savacc1.showInfo();
//        System.out.println("*************");
//        chkacc1.showInfo();

        // Read a CSV File then create new Accounts based on that data
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            System.out.println("NEW ACCOUNT");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
        }
    }
}
