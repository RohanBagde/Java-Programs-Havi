package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable2 {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String id="test";
			String pass="rohan";
			String url="jdbc:sqlserver://DESKTOP-N0BHS74;databaseName=WWE;integratedSecurity=true;encrypt=false;";
			Connection con= DriverManager.getConnection(url,id,pass);
			System.out.println("connected");
			
			//create table
			Statement smt= con.createStatement();
			smt.executeUpdate("create table players(id int,pname varchar(50),pRank int)");										
			System.out.println("table created");
			
		} 
	
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
