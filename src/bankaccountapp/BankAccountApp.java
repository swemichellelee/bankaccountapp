package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<>();

        // Unit Testing --
//        Checking chkacc1 = new Checking("Taylor Swift", "123456789", 1500);
//        Savings savacc1 = new Savings("Travis Kelce", "234567891", 2500);
//        savacc1.showInfo();
//        System.out.println("*************");
//        chkacc1.showInfo();

        // Read a CSV File then create new Accounts based on that data
        String file = "/Users/michellelee/desktop/NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);
            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if (accountType.equals("Checking"))
            {
                accounts.add(new Checking(name, sSN, initDeposit));
            } else
            {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }
        for (Account acc : accounts) {
            System.out.println("\n*************************");
            acc.showInfo();
        }
    }
}
