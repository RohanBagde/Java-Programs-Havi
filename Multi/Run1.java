package Multi;

public class Run1 extends Thread{
  public void run() {
	  System.out.println("run method");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Run1 thread=new Run1();
		thread.start();
	}

}
