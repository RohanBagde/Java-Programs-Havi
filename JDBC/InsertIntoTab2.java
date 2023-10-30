package com.JDBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertIntoTab2 {

	public static void main(String[] args) throws SQLException, NumberFormatException, IOException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String id="test";
			String pass="rohan";
			String url="jdbc:sqlserver://DESKTOP-N0BHS74;databaseName=WWE;integratedSecurity=true;encrypt=false;";
			Connection con= DriverManager.getConnection(url,id,pass);
			
			//insert data into table
			PreparedStatement psmt=con.prepareStatement("insert into players values(?,?,?)");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				System.out.println("Enter players id :");
				int pint=Integer.parseInt(br.readLine());
				
				System.out.println("Enter players name :");
				String pname=br.readLine();
				
				System.out.println("Enter players Rank :");
				int prank=Integer.parseInt(br.readLine());
				psmt.setInt(1, pint);
				psmt.setString(2, pname);
				psmt.setInt(3, prank);
				
				int count=psmt.executeUpdate();
				if(count>0)
				{
					System.out.println("record inserted");
				}
				else
				{
					System.out.println("record is not inserted");
						
				}
				Statement smt=con.createStatement();
				ResultSet res=smt.executeQuery("select * from players");
				while(res.next())
				{  
					System.out.println(res.getString(1)+" "+res.getString(2)+" "+res.getString(3));
				}					
			}
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
