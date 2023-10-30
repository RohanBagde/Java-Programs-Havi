package Experiments;

public class Exception {
	
	public static void Wait() throws InterruptedException {
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	}

	public static void main(String[] args) throws InterruptedException {
	Wait();
	System.out.println("Method executed");

	}

}
