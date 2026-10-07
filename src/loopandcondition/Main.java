package loopandcondition;

public class Main {

	public static void main(String[] args) {
		
		
		StudentMarks studentmark = new StudentMarks();
		studentmark.passfail();
		
		LoginValidation loginvalidation = new LoginValidation();
		loginvalidation.login();
		
		EmployeeSalary employeesalary = new EmployeeSalary();
		employeesalary.amt();
		
		Student student= new Student("Manuja");
		Student student2= new Student("dhavan");
		Student student3= new Student("priya");
		System.out.println(student.name + " - " + Student.collegeName);
		System.out.println(student2.name + " - " + Student.collegeName);
		System.out.println(student3.name + " - " + Student.collegeName);
		
		EmployeeSalaryCalculation company = new EmployeeSalaryCalculation();
		double[] salaries = {45000, 60000, 35000, 75000, 50000};
		for (int i = 0; i < salaries.length; i++) {
            company.calculateSalary(salaries[i]);
        }
		System.out.println("Total Employees: " + EmployeeSalaryCalculation.employeeCount);
		
		
		
		

	}

}
