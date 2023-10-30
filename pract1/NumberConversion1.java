package com.pract1;

import java.util.Scanner;

public class NumberConversion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 
		 * DECIMAL To BINARY
		 */
System.out.println("Enter the decimal number :");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String bin="";
while(n>0)
{
	int r=n%2;
	bin=r+bin;
	n=n/2;
}
System.out.println("Binary equivalent = "+bin);
	}

}
