package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {

	static String url="jdbc:mysql://localhost:3306/emp";
  static 	String username="root";
   static 	String password="MANuja@10";
	
	public static Connection  dbconnection() {
		Connection conn=null; //=>java => code check to send data
		try {
		conn= DriverManager.getConnection(url,username,password);
		}catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return conn;
	}
}