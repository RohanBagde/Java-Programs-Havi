package SB.SBU.ST;

import java.util.StringTokenizer;

public class StringTokenizer1 {

	public static void main(String[] args) {
		// 1st Scenario
		StringTokenizer s=new StringTokenizer("hiii helllo");
		while(s.hasMoreTokens())
		{
			System.out.print(s.nextToken());
		}
		System.out.println();
		///second scenario
		
		StringTokenizer str1=new StringTokenizer("help,me,i,am,running,out,of,time,save,me");
		while(str1.hasMoreTokens())
		{
			System.out.println(str1.nextToken(",").length());
		}
	}

}
