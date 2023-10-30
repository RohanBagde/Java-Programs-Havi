package OOPs;

class WithoutThis {
	int a;

	public void first(int a) {
		a = a;
	}

	public void show() {
		System.out.println(a + " this is the value of variable without this");
	}
}

class WithThis {
	int b;

	public void second(int b) {
		this.b = b;
	}

	public void show1() {
		System.out.println(b + " this is the value of variable without this");
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutThis without = new WithoutThis();
		without.first(10);
		without.show();
		WithThis with = new WithThis();
		with.second(15);
		with.show1();
	}

}
