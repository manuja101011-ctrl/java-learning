package InterfaceAbstractionAccessModifier;

public class CollegeStudent extends Student {
	
	
	public void studentdetails() {
		System.out.println("name: "+name);
		System.out.println("rollno: "+rollno);
		System.out.println("college: "+clg);
		super.displaypw();
	}
     
}
