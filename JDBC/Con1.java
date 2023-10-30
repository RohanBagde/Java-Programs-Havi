package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Con1 {

	public static void main(String[] args) {
		try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://DESKTOP-N0BHS74\\MSSQLSERVER;" + "databaseName=WWE;integratedSecurity=true";
            Connection con = DriverManager.getConnection(url);
            System.out.println("connected");
            JOptionPane.showMessageDialog(null, "connected");
            Statement s1 = con.createStatement();
        }
            catch(Exception e) {
            	}
            }
	}
