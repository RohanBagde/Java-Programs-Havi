package SB.SBU.ST;

public class StringVsStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double startTime = System.currentTimeMillis();
		String s = "Rohan";
		for (int i = 0; i <= 1000; i++) {
			s = s + " Bagde";
		}
		System.out.println(System.currentTimeMillis() - startTime);
		
		
		double startTimeSb = System.currentTimeMillis();
		StringBuffer stringbuffer = new StringBuffer();
		stringbuffer.append("hiii");
		for (int i = 0; i < 10000; i++) {
            stringbuffer.append(" Java tutorial");
        }
        System.out.println((System.currentTimeMillis() - startTimeSb)+"Milli seconds");
	}

}
