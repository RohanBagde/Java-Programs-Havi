package com.pract1;

public class Object1 {
	private int l,k;
	void setdiamensin(int x, int y){
		l=x;
		k=y;
	}
	public int area() {
		
		return l*k;
	}
	void display()
	{
		System.out.println("length "+l);
		System.out.println("breath "+k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object1 md=new Object1();
		md.setdiamensin(10, 12);
		md.display();
		System.out.println("area is "+md.area());

	}

}
