package com.stringmanipulation;

public class ChecksString {

	public static void main(String[] args) {
		
		
		//Without using new keyword
		//value stored in String constant pool
		String s1 = "Rohan";
		String s2 = "papa";
		String s3 = "Rohan";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println("==================================");
		//With using new keyword
		//value stored in heap address
		String str1= new String("Rohan");
		String str2= new String("papa");
		String str3= new String("Rohan");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str3);
		System.out.println("==================================");
		//String Buffer
		// location store in heap memory
		StringBuffer st1= new StringBuffer("Rohan");
		StringBuffer st2= new StringBuffer("papa");
		StringBuffer st3= new StringBuffer("Rohan");
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(st2==st3);
		
	}

}
