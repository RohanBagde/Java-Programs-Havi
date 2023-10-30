package OOPs;

class Smackdown {
	public void bigShow() {
		int PlayedMatch = 1245;
		int WinMatch = 695;
		int LoseMatch = PlayedMatch - WinMatch;
		System.out.println("Player loose " + LoseMatch + " matches in smackdown");
	}
}

class Raw extends Smackdown {
	@Override
	public void bigShow() {
		super.bigShow();
		int PlayedMatch = 2245;
		int WinMatch = 1056;
		int LoseMatch = PlayedMatch - WinMatch;
		System.out.println("Player loose " + LoseMatch + " matches in raw");

	}
}

class RunTimeParentClass {
	public static void main(String[] args) {
		Smackdown ray = new Raw();
		ray.bigShow();
	}
}
