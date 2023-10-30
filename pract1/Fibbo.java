package com.pract1;

import java.util.Scanner;

public class Fibbo {

	public static int fibonacci(int number) 
	{
		if(number==1 || number==2) 
		{
			return 1;
		}
		return fibonacci(number-1) + fibonacci(number -2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int number=sc.nextInt();
		for(int i=1; i<=number; i++){
	        System.out.print(fibonacci(i) +" ");
	    }
	}

}
