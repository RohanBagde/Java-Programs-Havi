package com.pract1;

public class JavaBean {
 private int data1;
 private String data2;
 private float data3;
 private double data4;
 
 
 
 // Setters and getters 
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		this.data2 = data2;
	}
	public float getData3() {
		return data3;
	}
	public void setData3(float data3) {
		this.data3 = data3;
	}
	public double getData4() {
		return data4;
	}
	public void setData4(double data4) {
		this.data4 = data4;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			JavaBean obj=new JavaBean();
			obj.data1=24;
			obj.data2="Rohan";
			obj.data3=15.45f;
			obj.data4=24545;
			System.out.println(obj.data1);
			System.out.println(obj.data2);
			System.out.println(obj.data3);
			System.out.println(obj.data4);
	}

}
