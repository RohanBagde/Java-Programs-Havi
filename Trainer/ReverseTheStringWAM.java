package Trainer;

import java.util.Scanner;

public class ReverseTheStringWAM {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String saw="";
		System.out.println("Enter the String :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int l=s.length();    //to find the length of string
		for(int i=l-1;i>=0;i--) //starts the iteration with end point
		{
			saw=saw+s.charAt(i);  // stores the reverse char at empty var.
		}
		System.out.println(saw);
	}

}
