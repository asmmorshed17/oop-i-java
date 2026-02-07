/*
3. Bank Account
• Create a BankAccount class with:
o Attributes: accountNumber, balance.
o Methods: deposit(), withdraw(), and displayBalance().
• In main, create two BankAccount objects and transfer money between them.
*/

class BankAccount {
int accountNumber ;
double balance ;

//Constructor: 
BankAccount(int acc_no,double initial_balance){
	accountNumber = acc_no ;
	balance = initial_balance;
}
//Deposit Money: 
 void deposit(double amount){
	if(amount>0){
		balance+=amount ;
		System.out.println(amount+ " deposited to account " +accountNumber);
	}
	else{
		System.out.println("Invalid deposit amount!");
	}
}		

//Withdraw Money: 
 void withdraw(double amount){
	if(amount>0 && amount<=balance){
		balance = balance - amount ;
		System.out.println(amount + " withdrawn from account "+ accountNumber);
	}
	else{
		System.out.println("Insufficient balance or invalid amount!");
	}
}

//Display Balance: 
 void displayBalance(){
System.out.println("Account " +accountNumber+ " Balance = "+balance);
}

//Transfer money to another account 
void transfer(BankAccount receiver,double amount){
	if(amount >0 && amount <=balance ){
		this.withdraw(amount);
		receiver.deposit(amount);
		System.out.println("Transferred " +amount+ " from account "+this.accountNumber+ " to account " +receiver.accountNumber);
	}
	else{
		System.out.println("Transfer failed! Check amount or balance.");
	}
}
}

class Tester3{
public static void main(String[]args){

//Create two bank accounts: 
BankAccount acc1 = new BankAccount(24250017,5000);
BankAccount acc2 = new BankAccount(24250021,3000);

System.out.println("-------------------------------------------------------------");

//display initial balance: 
acc1.displayBalance();
acc2.displayBalance();

System.out.println("-------------------------------------------------------------");

//Transfer money from account_1 to account_2 
acc1.transfer(acc2,1500);
System.out.println("-------------------------------------------------------------");

//Display final Balance: 
acc1.displayBalance();
acc2.displayBalance();
System.out.println("-------------------------------------------------------------");
}
}
