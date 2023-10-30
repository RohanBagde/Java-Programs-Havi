package Experiments;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String str=sc.nextLine();
		String rev="";
		StringTokenizer st=new StringTokenizer(str+" ");
		while(st.hasMoreTokens())
		{
			rev=st.nextToken()+" "+rev;
		}
		System.out.println(rev);
	}

}
