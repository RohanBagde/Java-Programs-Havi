package Experiments;
interface Inrf{
	public int sqrt1(int a);
}
public class FunInterface {

	public static void main(String[] args) {
	Inrf i= a-> a*a;
	System.out.println(i.sqrt1(5));
	}

}
