package oopsAccept;

public class Main {

	public static void main(String[] args) {
		StudentManagement obj=new StudentManagement();
		obj.displayDetails("manuja",5678,89);
		obj.displayDetails("priya",5679,48);
		
		
		Developer developer = new Developer("Manuja", 101, 30000, "Java");
		
		developer.displayDetails();
		
		BankAccount bank= new BankAccount(546123164,23000);
		bank.withdraw(1000);
		 System.out.println( bank.getBalance());	
		 
		  Payment payment;

	        payment = new UPIPayment();
	        payment.pay();

	        payment = new CardPayment();
	        payment.pay();

	        payment = new CashPayment();
	        payment.pay();
	        
	     Vehicle bike = new Bike();
	     bike.setSpeed(60);
	     bike.start();
	     System.out.println("bike speed: "+bike.getSpeed());
	     
	     Vehicle car = new Car();
	     car.setSpeed(100);
	     car.start();
	     System.out.println("Car speed: " + car.getSpeed());
	     car.stop();
	}

}
