package loopandcondition;

public class LoginValidation {
	
	  String username = "admin";
      String password = "12345";
      
      public void login() {
    	  if (username.equals("admin") && password.equals("12345")) {
              System.out.println("Login Successful");
          } else {
              System.out.println("Invalid Login");
          }
      }

}
