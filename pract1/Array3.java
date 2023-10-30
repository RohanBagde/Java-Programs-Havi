package com.pract1;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,4,5,6}; //iniatalize array
		int [] arr2=new int[arr.length];//create another array with same size
		for(int i=0;i<arr.length;i++)//copying data into another array
		{
			arr2[i]=arr[i];
		}
		System.out.println("Elements of orignal array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");  //printing orignal array
		}
		System.out.println("====================================");
		
		System.out.println("Elements of second array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr2[i]+" "); //printing dublicate array
	}

}
	}
