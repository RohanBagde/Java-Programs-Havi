package com.pract1;

import java.util.Scanner;

public class PerfectNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  long n,sum=0;
  Scanner s = new Scanner(System.in);
  System.out.print("Enter a number :");
  n=s.nextLong();
  int i=1;
  while(i<=n/2)
  {
	  if(n%i==0)
	  {
		  sum=sum+i;
	  }//eoIf
	  i++;
  }//eoWhile
  if(sum==n) {
	  System.out.println(n+" is the perfect numb  er");
  }
  else {
	  System.out.println(n+" is not the perfect number");
  }
	}

}
