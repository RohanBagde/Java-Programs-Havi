package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveDataFromTab1 {

	public static void main(String[] args) {
		// Default Procedure to get connection
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					String id="test";
					String pass="rohan"; 
					String url="jdbc:sqlserver://DESKTOP-N0BHS74;databaseName=Exam2;integratedSecurity=true;encrypt=false";
					Connection con=DriverManager.getConnection(url,id,pass);
					System.out.println("You are connected to database...");				
					// creating table in sqlserver
					// smt.executeUpdate("create table emp (eno int,ename varchar(50),esal int)");
					// System.out.println("table created successfully");						
					
				// Insert Data Into table
				//	Statement smt= con.createStatement();
				//	smt.executeUpdate("insert into emp values(111,'IronMan',3000)");
				//	System.out.println("Data inserted");
										
				//Retriving data
					Statement smt=con.createStatement();
					ResultSet res=smt.executeQuery("select * from emp");
					while(res.next())
					{  
						System.out.println(res.getString(1)+" "+res.getString(2)+" "+res.getString(3));
					}	
					
				} catch (ClassNotFoundException e) {
					
					e.printStackTrace();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}

	}

}
