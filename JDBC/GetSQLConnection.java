package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.text.html.Option;

public class GetSQLConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			// Jdbc sql server Driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Connection String
			String url = "jdbc:sqlserver://DESKTOP-N0BHS74;Database=Exam;integratedSecurity=true;trustServerCertificate=true;";
			String passwrd = "test";
			String userName = "rohan";
			// registering or loading the connection
			Connection con = DriverManager.getConnection(url, passwrd, userName);
			// Using a statement interface we can create and execute the SQL query
			System.out.println("connected");
						
		} 
		catch (SQLException e) 
		{

			e.printStackTrace();
		} 
		
	}

}
