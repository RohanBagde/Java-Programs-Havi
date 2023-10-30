package OOPs;

public class CompileTimePoly {
	public int pen(int a, int b) {
		return a + b;
	}

	public double pen(double x, double y) {
		return x * y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTimePoly srk = new CompileTimePoly();
		System.out.println(srk.pen(10, 20));
		System.out.println(srk.pen(144.454, 4.50));

	}

}
