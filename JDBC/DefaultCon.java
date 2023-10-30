package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DefaultCon {

	public static void main(String[] args) {
		try
		{
		String url="jdbc:sqlserver://DESKTOP-N0BHS74;databaseName=WWE;integratedSecurity=true;encrypt=false";
		Connection conn=DriverManager.getConnection(url);
		System.out.println("connection is sucessful");
		}
		catch(SQLException e) {
		System.out.println("connection failed");
		e.printStackTrace();
		}
	}
} 
