package com.pract1;

import java.util.Arrays;

public class Array9 {
	/*
	 * print the unique value by sort the array
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] {10,5,45,64,64,36,10,5};
	Arrays.sort(a);
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");  //printing orignal array
	}
			
	}
	

}
