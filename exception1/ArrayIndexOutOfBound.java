package com.exception1;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("First line");
		System.out.println("Second Line");
		System.out.println("Third line");
		
		try {
			int [] myIntArray =new int[] {1,2,3};
			PrintFourth(myIntArray);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("The array dont have four items");
		}
		
		System.out.println("Fourth Line");
		System.out.println("Fifth Line");
		System.out.println("Fifth Line");		
	}
	public static void PrintFourth(int[] arr)
	{
		System.out.println(arr[3]);
	}

}
