package Abstarct.Interface.Class;
interface One{
	void Show();
	void Display();
	default void Disco() {
		System.out.println(" i am Disco from One");
	}
	
}
class B implements One{

	@Override
	public void Show() {
		System.out.println("i am Show from B");
		
	}

	@Override
	public void Display() {
		System.out.println("i am Display from B");
		
	}
	
}
class C implements One{

	@Override
	public void Show() {
		System.out.println("i am Show from C");
		
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("i am Display from C");
	}
	
}
public class JdkOnePointEight {

	public static void main(String[] args) {
		C shot= new C();
		B not=new B();
		not.Show();
		not.Display();
		shot.Disco();
		shot.Show();
		shot.Display();
		not.Disco();

	}

}
