package com.JDBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDataFromTab2 {

	public static void main(String[] args) throws SQLException, IOException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String id="test";
			String pass="rohan";
			String url="jdbc:sqlserver://DESKTOP-N0BHS74;databaseName=WWE;integratedSecurity=true;encrypt=false;";
			Connection con= DriverManager.getConnection(url,id,pass);
			System.out.println("connected");
			Statement smt=con.createStatement();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				System.out.println("Enter deletion players id :");
				int pint=Integer.parseInt(br.readLine());
				
				int count=smt.executeUpdate("delete from players where id="+pint);
				if(count==1)
					System.out.println("record deleted");
				else
					System.out.println("id is not available");
			}
			
						
		}		
		 
	
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
