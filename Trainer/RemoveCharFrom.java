package Trainer;

import java.util.Scanner;

public class RemoveCharFrom {

	public static void main(String[] args) {
//	Remove characters from first string which are presented in the second string.
		String str3="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 :");
		String str1=sc.nextLine();
		System.out.println("Enter String 2 :");
		String str2=sc.nextLine();
		char[]stri1=str1.toCharArray();
		char[]stri2=str2.toCharArray();
		for(int i=0;i<str1.length();i++)
		{
			for(int j=0; j<str2.length();j++)
			{
				if(stri2[j]==stri1[i])
				{
					stri1[i]=0;
				}
			}
			str3=str3+stri1[i];
		}
		
		System.out.println(str3);
	}
}


