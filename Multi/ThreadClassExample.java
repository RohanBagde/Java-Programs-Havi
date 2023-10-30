package Multi;
class WWE extends Thread{
	@Override
	public void run() {
		try {
			for(int i=0;i<=5;i++)
			{
			
				System.out.println("world champion ");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}


public class ThreadClassExample  {

	public static void main(String[] args) throws InterruptedException {
		WWE wwe=new WWE();
		wwe.start();
		for(int i=0;i<=5;i++)
		{
			System.out.println("champion");
			Thread.sleep(1000);
		}
		

	}

}
