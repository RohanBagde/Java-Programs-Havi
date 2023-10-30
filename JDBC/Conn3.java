package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn3 {

	public static void main(String[] args) {
		try {
			String url="jdbc:sqlserver://DESKTOP-N0BHS74;databaseName=Exam;integratedSecurity=true;encrypt=false";
			Connection con= DriverManager.getConnection(url);
			System.out.println("success");
		} catch (Exception e) {
			System.out.println("connection failed");
			e.printStackTrace();
		}		
	}

}
