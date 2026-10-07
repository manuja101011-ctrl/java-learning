package InterfaceAbstractionAccessModifier;

public class Main {

	public static void main(String[] args) {
		
		Payment payment=new CreditCard();
		payment.payment();
		
		Payment payment2=new UPI();
		payment2.payment();
		
		 Vehicle vehicle1 = new Car();
	     vehicle1.start();
	     vehicle1.stop();

	     Vehicle vehicle2 = new Bike();
	     vehicle2.start();
	     vehicle2.stop();
	     
	     BankAccount bank = new BankAccount();
	     bank.display();
	     
	     ChildBank cb= new ChildBank();
	     cb.display();
	     
         Manager manager = new Manager();
         manager.calbonus();
         manager.work();
         
         CollegeStudent cs= new CollegeStudent();
         cs.studentdetails();
         
         
         
	}

}
