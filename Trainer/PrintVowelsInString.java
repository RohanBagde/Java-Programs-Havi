package Trainer;

import java.util.Scanner;

public class PrintVowelsInString {

	@SuppressWarnings("resource")
	public static void main(String[] args) { // 'a','e','i','o','u' are vowels except this all are consonent
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String here :");
		String s = sc.nextLine();
		char str[] = s.toCharArray();
		for (int i = 0; i <= str.length - 1; i++) {
			if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u') {
				System.out.println("This is vowel :" + str[i]);
			} else {
				System.out.println("this is consonent :" + str[i]);
			}
		}

	}

}
