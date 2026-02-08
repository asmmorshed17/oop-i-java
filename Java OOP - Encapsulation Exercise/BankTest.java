
/*
Exercise 10: Bank with Multiple Accounts
Create a class Bank:
• Private field: ArrayList<BankAccount> accounts.
• Provide constructors.
----------------------------------------------------------------------------------
• Add methods:
o addAccount(BankAccount acc)
o findAccount(String accountNumber) – returns the matching account.
o printAllAccounts() – prints info for all accounts.
• Test by creating a bank, adding accounts, and performing deposits/withdrawals.
 */


import java.util.ArrayList;

// BankAccount class (from previous Exercise 2)
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance! Setting to 0.");
            this.balance = 0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn.");
        } else {
            System.out.println("Invalid withdrawal or insufficient balance!");
        }
    }

    public void printStatement() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}

// Bank class
class Bank {

    private ArrayList<BankAccount> accounts;

    // Constructor
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Add account
    public void addAccount(BankAccount acc) {
        accounts.add(acc);
        System.out.println("Account " + acc.getAccountNumber() + " added.");
    }

    // Find account
    public BankAccount findAccount(String accountNumber) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        System.out.println("Account not found!");
        return null;
    }

    // Print all accounts
    public void printAllAccounts() {
        System.out.println("All Bank Accounts:");
        for (BankAccount acc : accounts) {
            acc.printStatement();
        }
    }
}

// Main class
public class BankTest {
    public static void main(String[] args) {

        Bank myBank = new Bank();

        BankAccount acc1 = new BankAccount("BA101", 5000);
        BankAccount acc2 = new BankAccount("BA102", 10000);
        BankAccount acc3 = new BankAccount("BA103", 2000);

        myBank.addAccount(acc1);
        myBank.addAccount(acc2);
        myBank.addAccount(acc3);

        System.out.println();

        // Perform transactions
        BankAccount acc = myBank.findAccount("BA102");
        if (acc != null) {
            acc.deposit(2000);
            acc.withdraw(5000);
        }

        System.out.println();

        myBank.printAllAccounts();
    }
}

/*
Account BA101 added.
Account BA102 added.
Account BA103 added.

2000.0 deposited.
5000.0 withdrawn.

All Bank Accounts:
Account Number: BA101, Balance: 5000.0
Account Number: BA102, Balance: 7000.0
Account Number: BA103, Balance: 2000.0
 */

