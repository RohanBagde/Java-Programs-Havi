package Multi;

public class Run2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Thread t1=new Thread("My first thread");
			t1.start();
			String str=t1.getName();
			System.out.println(str);
	}

}
