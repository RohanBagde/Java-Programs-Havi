package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn4 {

	public static void main(String[] args) {
		String ConnectionString="jdbc:sqlserver:DESKTOP-N0BHS74;Database=Exam  ;integratedSecurity=true";
		try {
			try (Connection con = DriverManager.getConnection(ConnectionString))
				{
				System.out.println("connected");
				}
		}
		catch(SQLException e)
		{
			System.out.println("error");
		}
	}

}
