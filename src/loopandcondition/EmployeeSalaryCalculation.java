package loopandcondition;

public class EmployeeSalaryCalculation {

	 static int employeeCount = 0;
	 final double TAX_RATE = 10;
	 
	  public void calculateSalary(double salary) {

	        employeeCount++;

	        double tax = salary * TAX_RATE / 100;
	        double finalSalary = salary - tax;

	        if (salary > 50000) {
	            System.out.println("High Salary");
	        } else {
	            System.out.println("Normal Salary");
	        }

	        System.out.println("Salary: " + salary);
	        System.out.println("Tax: " + tax);
	        System.out.println("Final Salary: " + finalSalary);
	        System.out.println();
	    }
}
