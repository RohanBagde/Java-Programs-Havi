package Experiments;

import java.lang.Exception;

class Throwset {
	public int DivideTwoNumber(int a, int b) throws Exception {
		String s = "hai";
		System.out.println(s.length());
		return a / b;
	}
}

public class ThrowExample {

	public static void main(String[] args) {
		try {
			Throwset test = new Throwset();
			int a = test.DivideTwoNumber(10, 2);
			System.out.println("end of java code");
		} catch (Exception e) {

		}

	}

}
