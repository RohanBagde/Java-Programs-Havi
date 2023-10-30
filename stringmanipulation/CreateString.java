package com.stringmanipulation;

public class CreateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1st method
		String s1="Rohan";
		System.out.println(s1);
		
		
		//2nd method
		 String s2= new String("Rohan");
		 System.out.println(s2);
		
		 
		 //3rd Method
		 char [] ch= {'a','b','c'};
		 String s3=new String(ch);
		 System.out.println(s3);
		 
		 //4th Method
		 String s4=new String(ch,0,2);  //ch is chararay 
		 								//0 is starting point
		 								//2 is a ending point
		 System.out.println(s4);
		 
		 //5th method
		 byte[] b= {65,66,67,68,69,70,71,72,73}; //Covert and shows ascii values
		 String s5=new String(b);
		 System.out.println(s5);
		 
		 //6th Method 
		 String s6=new String(b,3,3);
		 System.out.println(s6);
			 	 
				 
	}
	

}
