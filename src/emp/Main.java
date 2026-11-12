package emp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int choice=0;
Employee call= new Employee();
Scanner sc= new Scanner(System.in);
//do {
//	System.out.println("⭐⭐------------------Employee management--------------⭐⭐");
//	System.out.println("1.insert employee data");
//	System.out.println("2.display all employee data");
//	System.out.println("3.display particular employee data");
//	System.out.println("4.update employee data");
//	System.out.println("5.delete employee data");
//	System.out.print("enter your option:");
//	choice=sc.nextInt();
//	switch(choice) {
//	case 1:
//		call.empinsert();
//		break;
//	case 2:
//		call.Displayall();
//		break;
//	case 3:
//		call.displayid();
//		break;
//	case 4:
//		call.updateemp();
//		break;
//	case 5:
//		call.deleteempdata();
//		break;
//	case 0:
//		System.out.println("exit...");
//		break;
//		default:
//			System.out.println("incorrect opition");
//	}
//	
//	
//}
//while(choice !=0);

call.login();

	}

}