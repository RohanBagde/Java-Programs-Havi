package com.FiveJanAssessment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
//Java program to print time in EST format
public class TimeInESTFormat {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
        System.out.println(date+" "+time);
        DateTimeFormatter formats= DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(date.format(formats));
	}

}
