package InterfaceAbstractionAccessModifier;

public class BankAccount {

	 public int AccNo=12354689;
	 private double Balance=563.0;
	 protected  String name="manuja";
	 String BankName="SBI";
	 
	 public void display() {
		 System.out.println("balance: "+Balance);
	 }
	 
}
