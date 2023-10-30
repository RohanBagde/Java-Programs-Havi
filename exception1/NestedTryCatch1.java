package com.exception1;
class CustomMade extends Exception{  // always need to extends exception class
	CustomMade(String s)
	{							//create a constructor for passing massage
		super(s);
	}
}

public class NestedTryCatch1 {


	public static void main(String[] args) {
		System.out.println("Program execution start from here");
		System.out.println("==========================");
		int a,b,c;
		try {
			 
			a=10;
			b=11;
			try {
				c=a/b;
				System.out.println(a+" / "+b+" = "+c);
				if(c==0)
				{
					try {
						throw new CustomMade("denomenator is bigger than numarator"); //trying custom def exce
					}
					catch(CustomMade cm)
					{
						System.out.println(cm.getMessage());
					}
				}
			}
			catch(ArithmeticException e)
			{
				System.out.println("second argument should not be zero");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Given argumments should be Valid number");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("pass proper arguments");
		}
			System.out.println("program exceution ends here");
	}

}
