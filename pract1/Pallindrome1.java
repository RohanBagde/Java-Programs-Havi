package com.pract1;
import com.pract1.Factorial1;

import java.util.Scanner;



public class Pallindrome1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Checking pallindrome number
		Factorial1 dx=new Factorial1();
		dx.fact();

		int num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number :");
		num=sc.nextInt();
		int t=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num=num/10;
			
		}
		if(rev==t) {
			System.out.println(t+" is the pallindrome number");
		}
		else
		{
			System.out.println(t+" is not a pallindrome number");
		}
	
		

	}

}
