/*
Exercise 2: Validation with Encapsulation
Create a class BankAccount:
• Private fields: accountNumber (String), balance (double).
• Provide a constructor that initializes accountNumber and balance.
• Only allow positive balance in the setter; if negative, print "Invalid balance!".
• Write methods deposit(double amount) and withdraw(double amount) that update
the balance safely.
• Add a method printStatement() to display account details.
 */

class BankAccount {

    // Private data members
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance!");
            this.balance = 0;
        }
    }

    // Setter with validation
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance!");
        }
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }

    // Print account details
    public void printStatement() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

// Main class
public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("BA12345", 5000);

        acc.printStatement();

        acc.deposit(1500);
        acc.withdraw(2000);
        acc.withdraw(10000);   // Invalid case

        acc.printStatement();
    }
}

/*
Account Number: BA12345
Current Balance: 5000.0
Deposited: 1500.0
Withdrawn: 2000.0
Invalid withdrawal amount or insufficient balance!
Account Number: BA12345
Current Balance: 4500.0
 */