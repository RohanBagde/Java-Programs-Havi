package com.stringmanipulation;

public class ChckStringEquals {
	
	ChckStringEquals(String str)
	{
		
	}
	public static void main(String[] args) {
	
		// Equals() method present in Object class 
		// String class overrides Equals()methods
		// String class equal() method checks Value
		// Object class Equals() method checks reference comparison
		// == operator always checks reference comparison
		
		
//ex1    	
		ChckStringEquals t1=new ChckStringEquals("rohan");
		ChckStringEquals t2=new ChckStringEquals("rohan");
		System.out.println(t1.equals(t2));
		System.out.println(t1==t2);
		System.out.println("=====================================");
//ex2
				//StringBuffer:no class:it uses object class Equal()
				// reference comparison 
				
				StringBuffer sb1=new StringBuffer("rohan");
				StringBuffer sb2=new StringBuffer("rohan");
				System.out.println(sb1.equals(sb2) );
				System.out.println(sb1==sb2);
				System.out.println("=====================================");
//ex3	
		
		String s1="rohan";
		String s2="rohan";
		System.out.println(s1.equals(s2));  //here String is overriding equals method so functionality changes 
											//and it compares value content comparison
		System.out.println(s1==s2);	
		System.out.println("=====================================");
		
//ex4
		String str1=new String("rohan");
		String str2=new String("rohan");
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		System.out.println("=====================================");
	}

}
