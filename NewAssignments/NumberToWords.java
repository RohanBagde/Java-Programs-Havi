package NewAssignments;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NumberToWords {
	private static final String[] tenseNames={
			"",
			"Ten ",
			"Twenty ",
			"Thirty ",
			" Fourty ",
			"Fifty ",
			"Sixty ",
			"Seventy ",
			"Eighty ",
			"ninety "
			
			};
	private static final String[] numNames= {
			"",
			" One ",
			" Two ",
			" Three ",
			" Four ",
			" Five ",
			" Six ",
			" Seven ",
			" Eight ",
			" Nine ",
			" Ten ",
			" eleven ",
		    " twelve ",
		    " thirteen",
		    " fourteen",
		    " fifteen",
		    " sixteen",
		    " seventeen",
		    " eighteen",
		    " nineteen"
			
			
	};
	private NumberToWords() {}

	  private static String convertLessThanOneThousand(int number) {
	    String soFar;

	    if (number % 100 < 20){
	      soFar = numNames[number % 100];
	      number /= 100;
	    }
	    else {
	      soFar = numNames[number % 10];
	      number /= 10;

	      soFar = tenseNames[number % 10] + soFar;
	      number /= 10;
	    }
	    if (number == 0) return soFar;
	    return numNames[number] + " hundred " + soFar;
	  }
	  public static String convert(long number) {
		 
		    if (number == 0) { return "zero"; }

		    String snumber = Long.toString(number);

		   
		    String mask = "000000000000";
		    DecimalFormat df = new DecimalFormat(mask);
		    snumber = df.format(number);

		
		    int billions = Integer.parseInt(snumber.substring(0,3));
		  
		    int millions  = Integer.parseInt(snumber.substring(3,6));
		
		    int hundredThousands = Integer.parseInt(snumber.substring(6,9));
		 
		    int thousands = Integer.parseInt(snumber.substring(9,12));

		    String tradBillions;
		    switch (billions) {
		    case 0:
		      tradBillions = "";
		      break;
		    case 1 :
		      tradBillions = convertLessThanOneThousand(billions)
		      + " billion ";
		      break;
		    default :
		      tradBillions = convertLessThanOneThousand(billions)
		      + " billion ";
		    }
		    String result =  tradBillions;

		    String tradMillions;
		    switch (millions) {
		    case 0:
		      tradMillions = "";
		      break;
		    case 1 :
		      tradMillions = convertLessThanOneThousand(millions)
		         + " million ";
		      break;
		    default :
		      tradMillions = convertLessThanOneThousand(millions)
		         + " million ";
		    }
		    result =  result + tradMillions;

		    String tradHundredThousands;
		    switch (hundredThousands) {
		    case 0:
		      tradHundredThousands = "";
		      break;
		    case 1 :
		      tradHundredThousands = "one thousand ";
		      break;
		    default :
		      tradHundredThousands = convertLessThanOneThousand(hundredThousands)
		         + " thousand ";
		    }
		    result =  result + tradHundredThousands;

		    String tradThousand;
		    tradThousand = convertLessThanOneThousand(thousands);
		    result =  result + tradThousand;

		    // remove extra spaces!
		    return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
	
	  }
	  
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Digits :-");
	
		System.out.println(NumberToWords.convert(sc.nextInt()));
	}
}
