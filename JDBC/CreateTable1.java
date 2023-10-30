package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable1 {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String id="test";
			String pass="rohan"; 
			String url="jdbc:sqlserver://DESKTOP-N0BHS74;databaseName=Exam2;integratedSecurity=true;encrypt=false";
			Connection con=DriverManager.getConnection(url,id,pass);
			System.out.println("You are connected to database...");
			
			
			// creating table in sqlserver
			Statement smt= con.createStatement();
			smt.executeUpdate("create table emp (eno int,ename varchar(50),esal int)");
			System.out.println("table created successfully");
						
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
