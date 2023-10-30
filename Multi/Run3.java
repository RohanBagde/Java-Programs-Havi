package Multi;

public class Run3 implements Runnable {
	public void Thread1() {
		System.out.println("first thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=new Run3();
		Thread th1=new Thread(r1,"new thread built by Thread");
		th1.start();
		
		String str=th1.getName();
		System.out.println(str);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
