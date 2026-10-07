package oopsAccept;

 

public class Poly {
  public static void main(String[] args) {
	 int i=10;
	while(i-->0) {
		if(i==6) {
			continue;
		}
		System.out.println(i);
	}
	
   String[] name= {"manuja","priya","arun"};
   for(String names:name) {
	   System.out.println(names);
   }
	  
  }
}

