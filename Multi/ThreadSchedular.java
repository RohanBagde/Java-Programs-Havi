package Multi;
class Schedule extends Thread{
	public void run()
	{
		String n=Thread.currentThread().getName();
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(n+" "+ i);
				Thread.sleep(1000);
				
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
}
public class ThreadSchedular {

	public static void main(String[] args) {
		Schedule s1=new Schedule();
		Schedule s2=new Schedule();
		Schedule s3=new Schedule();
		Schedule s4=new Schedule();
		
		
		s1.setName("Thread-1 ");
		s2.setName("Thread-2 ");
		s3.setName("Thread-3 ");
		s4.setName("Thread-4 ");
		
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();

	}

}
