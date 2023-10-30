package com.pract1;

public class Construct3 {
	Construct3(int x, int y){
	System.out.println("first Constructor");
	
}
	Construct3(int x, int y, int z){
		System.out.println("second Constructor");
	}
	void default1() {
		int s=10;
		int c=20;
		double xx=s*c;
		System.out.println(xx);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Construct3 obj=new Construct3(10,20);
		Construct3 obj1=new Construct3(10,42,54);
		obj.default1();

	}

}
