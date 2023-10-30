package com.pract1;

import java.util.Scanner;

public class CheckStringNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String string=sc.nextLine();
     boolean numeric=true;
     try {
    	 double num=Double.parseDouble(string);
    	 
     }
     catch
    	 (NumberFormatException e)
    	 
     {
    	 numeric=false;
    	 
     }
     if(numeric)
    	System.out.println(string +" is a number"); 
	
	else
		System.out.println(string +" is not a number");
	}

}
