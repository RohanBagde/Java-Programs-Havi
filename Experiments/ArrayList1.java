package Experiments;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList();
		System.out.println("Please enter positive number");
		Scanner Dj=new Scanner(System.in);
		while(Dj.nextInt()>0) {
			list.add(Dj.hashCode());
			System.out.println(list);
		}
		Dj.close();
		

	}

}
