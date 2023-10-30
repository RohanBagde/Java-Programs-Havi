package com.pract1;

public class Construct2 {
	int breath;
	int length;
	int Height;
	double area;
	//constructor1
	Construct2(int x, int y)
	{
		breath=x;
		length=y;
		area=x*y;
		System.out.println(area);
		
	}
	Construct2(int x, int y,int z){
		breath=x;
		length=y;
		Height=z;
		area=x*y*z;
		System.out.println(area);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Construct2 obj=new Construct2(10,20);
		Construct2 obj1=new Construct2(20,30,40);

	}

}
