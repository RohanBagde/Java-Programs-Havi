package com.pract1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int rev;
		System.out.println("Enter any Number :");
		Scanner ref = new Scanner(System.in);
		num = ref.nextInt();
		while (num > 0) {
			rev = num % 10;
			num = num / 10;
			System.out.print(rev);
		}
	
	}

}
