package com.stringmanipulation;

public class Spilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "i worked in havi";
		String s2[]= s1.split(" ");
		
		for (int i=s2.length-1;i>=0;i--) {
			
			System.out.print(s2[i]);
		}

	}
}