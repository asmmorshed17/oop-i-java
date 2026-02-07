/*
Bank Account
• Create a BankAccount class with:
o Attributes: accountNumber, balance.
o Methods: deposit(), withdraw(), and displayBalance().
• In main, create two BankAccount objects and transfer money between them.
*/
class BankAccount{
String accountNumber;
double balance ;

//Constructor: 
BankAccount(String account_number, double Balance)
{
	accountNumber = account_number ;
	balance = Balance ;
}

void deposit(double amount){
		System.out.println("Deposit = "+amount);
	balance+=amount ;
      System.out.println("After Deposit: " +balance);
}

void withdraw(double amount){
	if(amount>0 && amount<=balance){
		System.out.println("Withdraw = "+amount);
		balance=balance-amount;
		System.out.println("After Withdrawn : "+balance);
	}
	else{
		System.out.println("Invalid Transaction");
	}
	
}

void displayBalance(){
	System.out.println("Account Number = "+accountNumber);
	System.out.println("Amount: "+balance);
}

}

class TesterC3{
	public static void main(String[]args){
	BankAccount BA1 = new BankAccount( "101",2500);
	BankAccount BA2 = new BankAccount("107",1500);
	
	
	System.out.println("------------------------------------------------");

    System.out.println("Account-1: ");
	
	System.out.println("------------------------------------------------");
	BA1.displayBalance();
	BA1.deposit(500);
	BA1.withdraw(1270);
	BA1.displayBalance();
	System.out.println("------------------------------------------------");
    System.out.println("Account-2: ");
	System.out.println("------------------------------------------------");	
	BA2.displayBalance();
	BA2.deposit(780);
	BA2.withdraw(5000);
	BA2.displayBalance();
	System.out.println("------------------------------------------------");
	
	}
	}
	
	/*
	E:\Code\Java\NN Mam Class>javac TesterC3.java

E:\Code\Java\NN Mam Class>java TesterC3
------------------------------------------------
Account-1:
------------------------------------------------
Account Number = 101
Amount: 2500.0
Deposit = 500.0
After Deposit: 3000.0
Withdraw = 1270.0
After Withdrawn : 1730.0
Account Number = 101
Amount: 1730.0
------------------------------------------------
Account-2:
------------------------------------------------
Account Number = 107
Amount: 1500.0
Deposit = 780.0
After Deposit: 2280.0
Invalid Transaction
Account Number = 107
Amount: 2280.0
------------------------------------------------
*/