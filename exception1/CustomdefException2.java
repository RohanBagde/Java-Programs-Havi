package com.exception1;

class XyzException extends Exception {
	public XyzException(String s) {
		super(s);
	}
}

public class CustomdefException2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			int c = a / b;
			System.out.println(c);
			if (c == 0) {
				throw new XyzException(" not going to work");
			}
		} catch (Exception e) {
			System.out.println("error" + e.getMessage());
		}

	}

}
