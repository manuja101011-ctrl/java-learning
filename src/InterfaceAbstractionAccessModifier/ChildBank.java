package InterfaceAbstractionAccessModifier;

public class ChildBank extends BankAccount {
	 
    public void display() {
    	System.out.println("Account number: "+AccNo);
    	System.out.println("Account HolderName: "+name);
    	System.out.println("BankName: "+BankName);
    }
    
}
