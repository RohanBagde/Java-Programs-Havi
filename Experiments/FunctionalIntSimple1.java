package Experiments;

@FunctionalInterface
interface Sample1 {
	default void m1() {}
    public void add(int a, int b);
}

public class FunctionalIntSimple1 {

	public static void main(String[] args) {
		Sample1 i = (int a, int b) -> System.out.println(a+b);
		i.add(10, 20);
		i.add(200, 4);
	}

}
