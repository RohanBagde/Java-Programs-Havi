package com.exception1;

public class ExceptionProgram {

	public static void main(String[] args) {
		ExceptionProgram ep=new ExceptionProgram();
		ep.divide();
		System.out.println("heloow");

	}

	void divide() {
		try {
			int a=100, b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
	}
}
