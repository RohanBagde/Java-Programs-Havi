package Enumurations;

public class Enum2 {
	enum Flavor{
		CHOCOLATE, VANILLA, BUTTERSCOTCH;
		public static void getVanilla() {
			System.out.println(Flavor.VANILLA);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flavor fav=Flavor.VANILLA;
		fav.getVanilla();
		
	}

}
