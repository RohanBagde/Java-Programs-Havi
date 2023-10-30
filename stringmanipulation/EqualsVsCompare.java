package com.stringmanipulation;

public class EqualsVsCompare {

	public static void main(String[] args) {
		String s1 = "rohan";
		String s2 = "papa";
		String s3 = "rohan";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		System.out.println("havi".equals("Havi"));
		System.out.println("havi".equalsIgnoreCase("Havi"));
System.out.println("=========================================");
//if two strings are equals returns 0
//papa-rohan: -2
//rohan-papa +2
System.out.println();
String st1 = "rohan";
String st2 = "papa";
String st3 = "rohan";
System.out.println(st1.compareTo(st2));
System.out.println(st1.compareTo(st3));
System.out.println(st2.compareTo(st3));
System.out.println("Rohan".compareTo("rohan"));
System.out.println("rohan".compareTo("Rohan"));
System.out.println("Rohan".compareToIgnoreCase("rohan"));
	}
	

}
