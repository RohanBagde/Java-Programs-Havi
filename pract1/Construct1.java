package com.pract1;

public class Construct1 {
	 Construct1()
	{
		System.out.println("Constructor call");
	}
	 int age;
	 Construct1(int x)
	 {
		this();
		 age=x;
		 System.out.println(x+" ");
	 }
	void m1() {
		System.out.println("m1 call");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Construct1 obj=new Construct1(19);
	
		obj.m1();
		
	}
	
		
}
	

