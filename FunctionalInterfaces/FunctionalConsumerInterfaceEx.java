package com.FunctionalInterfaces;
@FunctionalInterface
interface CalculateSquare{
	int SquareOfNumber(int x,int y);
}
public class FunctionalConsumerInterfaceEx {

	public static void main(String[] args) {
		CalculateSquare sq=(int x , int y) ->x*y;
		int output=sq.SquareOfNumber(5, 10);
		System.out.println(output);

	}

}
