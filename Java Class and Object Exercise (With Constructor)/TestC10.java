/*
 10. Bank Transaction Tracker
• Create a BankAccount class with fields:
accountHolder, balance, and transactionHistory (as an array of Strings).
• Add methods:
o deposit(double amount) → updates balance and stores "Deposited X" in history.
o withdraw(double amount) → updates balance if enough funds, else print error.
o showHistory() → prints all transaction history.
 */

//BankAccount Class 
class BankAccount{
    String accountHolder;
    double balance;
    String[] transactionHistory;
    int transactionCount;

    BankAccount(String accountHolder,double balance,int maxTransaction){
        this.accountHolder = accountHolder ;
        this.balance = balance ;
        this.transactionHistory = new String[maxTransaction];
        this.transactionCount = 0 ;
    }


    //Deposit Method:
    void deposit(double amount){
        balance+=amount ;
        transactionHistory[transactionCount++] = "Deposited " + amount ;
        System.out.println(accountHolder + " deposited " + amount + " . New Balance : " + balance);
    }

    //Withdraw Method: 
    void withdraw(double amount){
        if(amount<=balance){
            balance -= amount ;
            transactionHistory[transactionCount++] = "Withdraw " + amount ;
            System.out.println(accountHolder + " withdraw " + amount + " . New Balance : " + balance);
        }
        else{
            System.out.println("Insufficient funds for withdrawal of " + amount);
        }
    }

    //Show transaction history 
    void showHistory(){
        System.out.println("Transaction history of " +accountHolder + ": ");
        if(transactionCount==0){
            System.out.println("No Transaction yet.");
        }
        else{
            for(int i=0 ;i<transactionCount;i++){
                System.out.println((i+1) + ". " + transactionHistory[i]);
            }
            System.out.println("-------------------------------------------------------------------------------");
        }
    }
}

public class TestC10{
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount("Morshed",1000.0,10);
     
        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.withdraw(1500);
        acc1.deposit(300);

        
        System.out.println("-------------------------------------------------------------------------------");
        acc1.showHistory();

    }
}

/*
Morshed deposited 500.0 . New Balance : 1500.0
Morshed withdraw 200.0 . New Balance : 1300.0
Insufficient funds for withdrawal of 1500.0
Morshed deposited 300.0 . New Balance : 1600.0
-------------------------------------------------------------------------------
Transaction history of Morshed:
1. Deposited 500.0
2. Withdraw 200.0
3. Deposited 300.0
-------------------------------------------------------------------------------
 */