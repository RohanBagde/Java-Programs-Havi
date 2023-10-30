package Multi;
class Join extends Thread{
	public void run()
	{
		String name= Thread.currentThread().getName();
		for(int i=1;i<=3;i++)
		{
			
			System.out.println(name+"->"+i);
		}
	}
}

public class JoinMethodInException {

	public static void main(String[] args) {
		Join j1=new Join();
		Join j2=new Join();
		Join j3=new Join();
		Join j4=new Join();
		
		
		j1.setName("Thread 1");
		j2.setName("Thread 2");
		j3.setName("Thread 3");
		j4.setName("Thread 4");
		
		j2.start();
		
		try {
			j2.join();           // After successfully completion of j2 method 
			                     //then only Other methods start excuting
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		j1.start();
		j3.start();
		j4.start();
		
	
	}

}
