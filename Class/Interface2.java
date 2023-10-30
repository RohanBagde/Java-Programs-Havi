package Abstarct.Interface.Class;
interface TestInterface {
    void show();
    void display1();
	void display();
    int count = 10;
}
class ImplementationClass implements TestInterface {
   @Override
    public void show() {
        System.out.println("Show");
    }
   @Override
    public void display() {
        System.out.println("Display");
    }
   @Override
   public void display1() {
	   System.out.println("display1");
   }
}

public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationClass ic = new ImplementationClass();
        ic.display();
        ic.show();
        ic.display1();
        System.out.println(TestInterface.count);
	}

}
