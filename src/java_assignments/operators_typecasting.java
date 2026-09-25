package java_assignments;

public class operators_typecasting {
	public static void main(String[] args) {
		int student_A =85;
	    double avg= Double.valueOf(student_A);
	    System.out.println(avg);
	   
	    double product_price=999.50;
	    int purchased=3;
	    double discount=(double) 10/100;
	    double total= product_price*purchased;
	    double calculation= total-(total*discount);
	    System.out.println(calculation);
	    
	    int emp_salary=25000;
	    double increment= (double)15/100;
	    double current= emp_salary + (emp_salary * increment);
	    System.out.println(current);
        System.out.println(current>28000);	 
        
        double value=25.75;
        int value2= (int) value;
        if(value2%2==0) {
        	System.out.println("even");
        }else {
        	System.out.println("odd");
        }
        
        double age =21.5;
        int age2=(int) age;
        if(age2>=18 && age2<=60) {
        	System.out.println("elligible");
        }else {
        	System.out.println("not elligible");
        }
	  
	}

}
