package OOPs;

public class Runtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunTimePoly srk = new RunTimePolyChild();
		srk.running();
	}

}

class RunTimePoly {
	public void running() {
		System.out.println("RunningParaent");
	}
}

class RunTimePolyChild extends RunTimePoly {
	@Override
	public void running() {
		System.out.println("RunningChild");
	}
}
