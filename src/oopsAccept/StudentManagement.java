package oopsAccept;

public class StudentManagement {

	String name;
	long rollno;
	int mark;
	
	void displayDetails(String name,long rollno,int mark) {
		this.name=name;
		this.rollno=rollno;
		this.mark=mark;
		System.out.println("name: "+name);
		System.out.println("rollno: "+rollno);
		System.out.println("mark: "+mark);
		
	}
	
}
