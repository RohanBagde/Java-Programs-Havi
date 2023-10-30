package Abstarct.Interface.Class;
abstract class ClassAbstract{
	void dude() {
		System.out.println("I am a concrete method from abstract class");
	}
	abstract void dudes(); 
	
	public static void frog() {
		System.out.println("i am a static method from abstract class");
	}
}
class Normal extends ClassAbstract{

	@Override
	void dudes() {
		super.dude();
		System.out.println("i am abstract overriden method method ");			
	}
	@Override
	public void dude() {
		System.out.println("I am concrete method from normal class");
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassAbstract.frog();
		Normal nor= new Normal();
		nor.dude();
		nor.dudes();
	}

}
