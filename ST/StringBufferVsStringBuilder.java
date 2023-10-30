package SB.SBU.ST;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ss = System.currentTimeMillis();
		StringBuffer SB = new StringBuffer();
		SB.append("Havi");
		for (int i = 0; i <= 1000; i++) {
			SB = SB.append("solutions");
		}
		System.out.println(System.currentTimeMillis() - ss);
		double ss1 = System.currentTimeMillis();
		StringBuffer SB1 = new StringBuffer();
		SB1.append("Havi");
		for (int i = 0; i <= 1000; i++) {
			SB = SB.append("solutions");
		}
		System.out.println(System.currentTimeMillis() - ss1);
	}

}
