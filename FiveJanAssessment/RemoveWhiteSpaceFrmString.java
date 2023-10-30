package com.FiveJanAssessment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RemoveWhiteSpaceFrmString {

	//Java program to remove all white spaces from the string
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String with spaces :");
		String[] swa=null;
		try {
			String sw=sc.nextLine();
			swa = sw.split(" ");
		} 
		catch (InputMismatchException e) {
			System.out.println("Enter String onlys");
		}
		System.out.print("White Spaxes removed :");
		for (String sda : swa) {
			System.out.print(sda);
		}
	}
}
