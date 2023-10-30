package com.stringmanipulation;

public class EqualsMethod {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		// Wrong way to use equals method
		String s1 = "Rohan";
		String s2 = "Rohan";
		if(s1.equals(s2))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
		// Correct way to use equals method
		//why because if str1 value is set to be null then it shows nullpointer exception
		String str1 = "Rohan";
		String str2= "Rohan";
		if("Rohan".equals(str2))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
		//null pointer exception example
		String z1="Rohan";
		String z2=null;

		if("Rohan".equals(z2))
		{
			System.out.println("second");
		}
		else {
			System.out.println("Null pointer");
		}
			
	}

}
