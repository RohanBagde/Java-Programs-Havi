package Experiments;

public class Countint1 {

	public static void main(String[] args) {
		int a=1234;
		int count=0;
		while(a>0)
		{
			a=a/10;
			count++;
		}
		System.out.println(count);

	}

}
