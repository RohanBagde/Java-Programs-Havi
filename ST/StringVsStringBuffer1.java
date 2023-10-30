package SB.SBU.ST;

public class StringVsStringBuffer1 {

	public static void main(String[] args) {
	   double st= System.currentTimeMillis();
	   String str= " we will";
	   for(int i=0;i<=1000;i++) {
		   str=str+" rock you -";
	   }
	   System.out.println(str);
	   System.out.println(System.currentTimeMillis()-st+ " millis");
	   double st1=System.currentTimeMillis();
	   StringBuffer str1= new StringBuffer();
	   str1.append(" kame hame ");
	   for(int i=0;i<=1000;i++)
	   {
		   str1.append("haa");
	   }
	   System.out.println(System.currentTimeMillis()-st1 +" millis");
	   
	}

}
