package Abstarct.Interface.Class;
interface Light{
	
	void m1(); // simple method cannot have method body
	
	static void StaticMethod() {   //Static method
		System.out.println(" i am from Static");
	}
	abstract void Abstarct(); // abstract method dont have body
	
	default void Default1() {
		System.out.println(" iam from default");
	}
	
}
class Shika implements Light{

		@Override
		public void m1() {
			// TODO Auto-generated method stub
			System.out.println(" i am simple method overriding ");
		}

		@Override
		public void Abstarct() {
			// TODO Auto-generated method stub
	  System.out.println(" i am from abstract overridden");		
		}
		@Override
		public void Default1() {
			System.out.println("Overriden method"); //after overriden we can call only overrideen method
		}
	}
		


public class CrossChecks1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shika obj=new Shika();
		obj.Default1();
		obj.m1();
		obj.Abstarct();
		Light.StaticMethod();

	}

}
