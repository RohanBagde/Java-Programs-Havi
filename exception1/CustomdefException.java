package com.exception1;
class Custom extends RuntimeException{
		
}
public class CustomdefException {

	public static void main(String[] args) {
		try {
			throw new Custom();
		}
		catch(Exception e)
		{
			 System.out.println("Caught");
	            System.out.println(e.getMessage());
		}

	}

}
