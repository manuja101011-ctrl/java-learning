package loopandcondition;

public class StudentMarks {

	int[] marks= {45,56,89,78,55};
	
	public void passfail() {
		
		   for (int i = 0; i < marks.length; i++) {

	            if (marks[i] > 50) {
	                System.out.println("Student " + (i + 1) + ": Pass");
	            } else {
	                System.out.println("Student " + (i + 1) + ": Fail");
	            }
	        }
		
	}
}
