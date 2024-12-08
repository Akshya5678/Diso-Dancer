package com.app3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeService {
	public static void main(String[] args) {
		
	

	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");   
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/akshya","root","root");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);  
		ResultSet rs=stmt.executeQuery("select * from emp2");  
		System.out.println("Data before updation");
		System.out.println("---------------------------");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));
		}
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		} 
}
