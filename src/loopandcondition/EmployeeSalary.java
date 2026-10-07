package loopandcondition;

public class EmployeeSalary {
 
	  double basicSalary = 30000;
	  
	  final double PF_PERCENTAGE = 12;
	  
	  public void amt() {
		  
		  double pfAmount = basicSalary * PF_PERCENTAGE / 100;

	        System.out.println("Basic Salary: " + basicSalary);
	        System.out.println("PF Amount: " + pfAmount);
	  }
}
