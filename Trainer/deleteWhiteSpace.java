package Trainer;

import java.util.Scanner;

public class deleteWhiteSpace {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the String with Spaces :");
		String s=Sc.nextLine();
		String []a=s.split(" ");  //using split method we can remove the spaces
		for(String as:a)
		{
			System.out.print(as);
		}//eof
	}//eom

}//eoc
