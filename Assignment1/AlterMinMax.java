package Assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Write a java program to display array elements as alternative minimum and maximum values
//Sample Input:
//Array size : 5
//Array Elements : 2 7 5 8 6
//Sample Output: 8 2 7 5 6(max min max min format).
public class AlterMinMax {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of array :");
		int n=input.nextInt();
	    int[] numbers = new int[n];
	    int l=numbers.length;
	    for (int i = 0; i<l; i++)
	    {
	        System.out.print("Please enter number :");
	        numbers[i] = input.nextInt();
	    }
	    Arrays.sort(numbers);
	    int i=0;
	    int j=n-1;
	    while(i<j) 
	    {
	    	System.out.println(numbers[j--]+" ");
	    	System.out.println(numbers[i++]+" ");
	    }
	    if(n%2!=0) //if array is odd number of ele then it will print middel ele
	    {
	    	System.out.print(numbers[i]);
	    }    

	}
}


