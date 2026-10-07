package condition;

public class GradeCalculation {
    int mark=90;
    
    public void grade() {
    	  if (mark >= 90 && mark <= 100) {
              System.out.println("A Grade");
          } else if (mark >= 75) {
              System.out.println("B Grade");
          } else if (mark >= 50) {
              System.out.println("C Grade");
          } else if (mark >= 40) {
              System.out.println("D Grade");
          } else {
              System.out.println("Fail");
          }
    }
}
