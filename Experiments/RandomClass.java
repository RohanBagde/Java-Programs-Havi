package Experiments;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		Random rad=new Random();
		int val=rad.nextInt(9);
		System.out.println(val);
	}

}
