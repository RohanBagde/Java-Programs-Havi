package OOPs;

public class CompileTimePoly1 {
	public void orange() {
		System.out.println("orange ");
	}

	public void orange(String ff) {
		System.out.println("parameter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTimePoly1 rog = new CompileTimePoly1();
		rog.orange(); // by seeing parameter we can uderstand which method is going to execute
		rog.orange("havai");

	}

}
