package com.exception1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLTimeoutException;

public class ConnectionClosedExce {

	public static void main(String[] args) {
		Connection con =null;  //import and set the connection as null
		PreparedStatement ps=null; //import and set the ps as null
		resultSet rs=null;
		try
		{
			//Some Sql querries
		}
		finally{
			try
			{
				((Connection) rs).close(); //closing the resultset
			}
			catch(SQLException sse)
			{
				
			}
			try
			{
				ps.close(); // clossing prepaprd statement
			}
			catch(SQLException ssd)
			{
				
			}
			try
			{
				con.close();      //closing the connection
			}
			catch(SQLException ssa){
				
			}
		}
		
	
	}

}
