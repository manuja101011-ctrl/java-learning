package emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {

	String tablecreation="create table emptable("+
			"empid int primary key,"+
			"empname varchar(50),"+
			"empsalary double,"+
			"empshifttime varchar(50),"+
			"emppassword varchar(10)"+");";
	
	Connection conn=Dbconnection.dbconnection();
	Scanner sc= new Scanner(System.in);
	public void emptablecreation() {
		try {
		Statement st= conn.createStatement();
		st.executeUpdate(tablecreation);
		System.out.println("table is created");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	String insert="insert into emptable(empid,empname,empsalary,empshifttime,emppassword) value(?,?,?,?,?)";
	public void empinsert() {
		try {
			System.out.println("Enter your empid");
			int empid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter your empname");
			String empname=sc.nextLine();
			System.out.println("Enter your empsalary");
			double empsalary=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter your empshifttime");
			String empshifttime=sc.nextLine();
			System.out.println("Enter your password");
			String emppassword=sc.nextLine();
			PreparedStatement ps=conn.prepareStatement(insert);
			ps.setInt(1, empid);
			ps.setString(2, empname);
			ps.setDouble(3, empsalary);
			ps.setString(4, empshifttime);
			ps.setString(5, emppassword);
			int row=ps.executeUpdate();
			if(row==1) {
				System.out.println("data stored successfully");
			}
			else {
				System.out.println("data not stored");
			}
			
		}catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	String display="select * from emptable";
	public void Displayall() {
		try {
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(display);
			while(rs.next()) {
				System.out.println("empid:"+rs.getInt("empid")+",empname:"+rs.getString("empname")+
						",empsalary:"+rs.getDouble("empsalary")+",empshifttime:"+rs.getString("empshifttime")+
						",emppassword:"+rs.getString("emppassword"));
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	String displayone="select * from emptable where empid=?";
	public void displayid() {
		try {
			System.out.println("enter your search id");
			int empid=sc.nextInt();
			PreparedStatement ps=conn.prepareStatement(displayone);
			ps.setInt(1, empid);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("empid:"+rs.getInt("empid")+",empname:"+rs.getString("empname")+
						",empsalary:"+rs.getDouble("empsalary")+",empshifttime:"+rs.getString("empshifttime")+
						",emppassword:"+rs.getString("emppassword"));
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
	
	
	String updateemp="update emptable set empid=?, empname=?,empsalary=?,empshifttime=?,emppassword=? "
			+ "where empid=?";
	public void updateemp() {
		try {
			System.out.println("enter your old empid");
			int oldempid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter your new empid(update)");
			int empid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter your empname");
			String empname=sc.nextLine();
			System.out.println("enter your empsalary");
			double empsalary=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter your empshift time");
			String empshifttime=sc.nextLine();
			System.out.println("Enter your Emppassword");
			String emppassword=sc.nextLine();
			
			PreparedStatement ps=conn.prepareStatement(updateemp);
			ps.setInt(1, empid);
			ps.setString(2, empname);
			ps.setDouble(3, empsalary);
			ps.setString(4, empshifttime);
			ps.setString(5, emppassword);
			ps.setInt(6, oldempid);
			
			int row = ps.executeUpdate();
			if(row==1) {
				System.out.println("data is updated");
			}else {
				System.out.println("data is not updated");
			}
			
			
		}catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	String deleteemp="delete from emptable where empid=?";
	public void deleteempdata() {
		try {
			System.out.println("Enter your delete(empid)");
			int empid=sc.nextInt();
			PreparedStatement ps=conn.prepareStatement(deleteemp);
			ps.setInt(1, empid);
			int row= ps.executeUpdate();
			if(row==1) {
				System.out.println("data is deleted");
			}else {
				System.out.println("data is not deleted");
			}
		}catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	
	}
	String loginemp="select * from emptable where empid=? && emppassword=?";
	public void login(){
		try {
			System.out.println("enter the empid");
			int empid=sc.nextInt();
			System.out.println("enter the emppassword");
			int emppassword=sc.nextInt();
			
			PreparedStatement ps = conn.prepareStatement(loginemp);
			ps.setInt(1, empid);
			ps.setInt(2,emppassword);
			
			ResultSet rs=ps.executeQuery();
			
		}catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
}