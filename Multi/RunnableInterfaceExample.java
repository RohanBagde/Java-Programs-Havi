package Multi;

class WWE1 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			int c=9*i;
			System.out.println(9+"x"+i+" = "+ c );		
		}
		
	}	
}
public class RunnableInterfaceExample {

	public static void main(String[] args) {
		try {
			WWE1  wwe1=new WWE1();
			wwe1.run();
			Thread.sleep(10000);
			System.out.println("Execution Completed");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
