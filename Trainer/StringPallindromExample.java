package Trainer;

import java.util.Scanner;

public class StringPallindromExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r = "";
		System.out.println("Enter the String :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int l = s.length();
		for (int i = l - 1; i >= 0; i--) {
			r = r + s.charAt(i);
		}
		System.out.println(r);
		if (r.equals(s)) {
			System.out.println("String is pallindrome");
		} else {
			System.out.println("String is not pallindrome");
		}

	}

}
