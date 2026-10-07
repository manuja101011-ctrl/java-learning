package InterfaceAbstractionAccessModifier;

public class Manager extends Employee implements Bonus{
	
	public void work() {
		System.out.println("team work");
	}
	public void calbonus() {
		System.out.println("get bonus");
	}

}
