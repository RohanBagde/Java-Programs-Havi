package Trainer;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=6;i++)
		{
			for(j=6;j>i;j--) {
				System.out.print(" *");				
			}			
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			System.out.println();
				
			}
		}
	}


