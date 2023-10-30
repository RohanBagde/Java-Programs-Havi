package com.pract1;

import java.util.Scanner;

public class Revnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Number :");
		int numb=sc.nextInt();
		int rev=numb%10;
		rev=numb/10;
		System.out.println(rev);
	}

}
