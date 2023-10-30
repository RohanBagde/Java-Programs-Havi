package Trainer;

import java.util.Scanner;

public class RepeatedCharOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Type a String here :");
		String s = sc.nextLine();
		char str[] = s.toCharArray();// converting string into charArray
		System.out.println(str);
		for (int i = 0; i < str.length; i++) {            //used for to check character
			for (int j = i + 1; j < str.length; j++) {    //used inner for to check which char is repeat
				if (str[i] == str[j] && str[i] != ' ') {  // if condition to check char is same as previous
					System.out.println(str[j] + " is repeated");     // if same then print that char
					break;
					
					
				}//EOIF
			}//EOFOR
		}//EOF
	}//EOFM

}//EOC
