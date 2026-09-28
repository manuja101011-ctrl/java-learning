package oopsAccept;

public class BankAccount {
   private long accNo;
   private double balance;
   
   BankAccount(long accNo,double balance){
	   this.accNo=accNo;
	   this.balance=balance;
   }
   
   void deposit(double amount) {
	   balance=balance+amount;
   }
   void withdraw(double amount) {
	   balance=balance-amount;
   }
   public double getBalance() {
	   return balance;
   }
}
