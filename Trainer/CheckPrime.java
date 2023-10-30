package Trainer;

import java.util.Scanner;

public class CheckPrime {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter a number :");
   int num=sc.nextInt();
   if(num==1)
   {
	   System.out.println("prime number starts from 2 :");
	   
   }
   int i;
   for( i=2;i<num;i++)
   {
	   if(num%i==0)
	   {
		   System.out.println(num+" is not a prime number ");
	   break;
	   }
	   
   }
   if(num==i)
	   System.out.println(num+" is a prime number");
		   
	}

}
