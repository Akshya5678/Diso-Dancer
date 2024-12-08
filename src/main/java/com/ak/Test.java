package com.ak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
public static void main(String[] args) {
	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/akshya","root","root");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		  

		ResultSet rs=stmt.executeQuery("select*from emp2");
		
		rs.afterLast();
		rs.previous();
		System.out.println(rs.getString(3));
		
		rs.beforeFirst();
		rs.next();
		System.out.println(rs.getInt(1));
		
		
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  
}

