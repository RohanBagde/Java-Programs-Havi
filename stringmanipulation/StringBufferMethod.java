package com.stringmanipulation;

public class StringBufferMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("i am naruto uzumaki");
		System.out.println(sb1.delete(2,11));
		System.out.println(sb1.deleteCharAt(3));
		
		System.out.println("=================================");
		StringBuffer sb2 = new StringBuffer("i am naruto uzumaki");
		System.out.println(sb2.reverse());
		sb2.append(" Hokage");
		System.out.println(sb2);
		
		System.out.println("=================================");
		StringBuffer sb3 = new StringBuffer("eye for an ");
		sb3.insert(11, "eye");
		System.out.println(sb3);
		sb3.replace(0, 3, "shy");
		System.out.println(sb3);
		
	}

}
