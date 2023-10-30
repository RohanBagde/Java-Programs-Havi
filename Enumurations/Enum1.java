package Enumurations;

public class Enum1 {
	enum Flavor {
		CHOCOLATE, VANILLA, BUTTERSCOTCH;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flavor flav = Flavor.CHOCOLATE;
		if(flav==flav.VANILLA) {
			System.out.println("its vanilla");
		if(flav==flav.CHOCOLATE) {
			System.out.println("its chocolate");
		if(flav==flav.BUTTERSCOTCH) {
			System.out.println("its butterscotch");
		}	
		}	
		}
	}

}
