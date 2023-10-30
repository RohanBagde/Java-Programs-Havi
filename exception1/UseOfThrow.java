package com.exception1;

public class UseOfThrow {
	void Divison(int a ,int b) throws ArithmeticException  //throws bypassing exception 
	{
		if(b==0)
		{
			throw new ArithmeticException(); //if b values is 0  then throw arithmetic exception
		}
		else
		{
			int c=a/b;
			System.out.println("the value of c is : "+c);
		}
	}	

	public static void main(String[] args) {
		UseOfThrow thro=new UseOfThrow();
		try {
			thro.Divison(10, 0); //passing values to a ,b
		}
		catch(Exception e)
		{
			System.out.println("The value of b is zero :");
		}
		

	}

}
