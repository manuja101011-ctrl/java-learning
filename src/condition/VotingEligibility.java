package condition;

public class VotingEligibility {
    
	int age=45;
	
	public void vote() {
		 if (age >= 18) {
	            System.out.println("Eligible to Vote");
	        } else {
	            System.out.println("Not Eligible");
	        }
	}
	
	
}
