package com.exception;

public class Finally1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="14555";
		int a;
		
		try {
			 a=Integer.parseInt(s);
			 System.out.println(a);
		}
		catch(Exception e) {
			System.out.println(" catch block "+e);
		}
		finally{
			System.out.println("i dont care about exception");
			
		}

	}

}
