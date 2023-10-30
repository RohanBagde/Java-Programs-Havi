package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDonSQL {

	public static void main(String[] args) throws SQLException {
		try {
			//Dwnld driver first
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String id="test";
			String pass="rohan"; 
			String url="jdbc:sqlserver://DESKTOP-N0BHS74;databaseName=Exam2;integratedSecurity=true;encrypt=false";
			Connection con=DriverManager.getConnection(url,id,pass);
			System.out.println("You are connected to database...");
			
			//Retriving data
			Statement smt=con.createStatement();
			ResultSet res=smt.executeQuery("select * from ExamDet");
			while(res.next())
			{
				System.out.println(res.getString(1));
			}
			
			// Creating table 
			//Statement smt= con.createStatement();
			//smt.executeUpdate("");
			//System.out.println("table created successfully");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
