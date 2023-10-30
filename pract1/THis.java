package com.pract1;

public class THis {
	int id;
	String name;
	THis(int x,String y){
		this.id=x;
		this.name=y;
	}
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		THis obj1=new THis(10,"rohan");
		THis obj2=new THis(20,"shubham");
		obj1.display();
		obj2.display();

	}

}
