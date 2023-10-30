package com.exception1;

public class NullPointerExce {

	public static void main(String[] args) {
		String s1=null;
		
		try {
			System.out.println(s1.toUpperCase());
		}
		catch(NullPointerException e)
		{
			System.out.println("null cannot casted :");
		}

	}

}
