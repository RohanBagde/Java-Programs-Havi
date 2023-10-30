package Trainer;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		//Convert String into Integer
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String :");
		String str=sc.nextLine();
		int ints = 0;
		try {
		 ints=Integer.parseInt(str);
		 System.out.println(str+" is now converted integer :"+ ints);
		}
		catch(NumberFormatException e)
		{
			System.out.println("char or string cannnot be converted into integer");
		}
		
	}

}
