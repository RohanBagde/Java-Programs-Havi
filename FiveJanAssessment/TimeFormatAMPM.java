package com.FiveJanAssessment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
//Java program to format time in AM PM format
public class TimeFormatAMPM {

	@SuppressWarnings("deprecation")		
		public static void main(String[] args) {
	        LocalDate date = LocalDate.now();
	        System.out.println(date.getDayOfYear());
	        LocalTime time = LocalTime.now();
	        System.out.println(date+" "+time);
	        LocalDateTime dateTime = LocalDateTime.now();
	        System.out.println(dateTime);
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
	        System.out.println(date.format(formatter));
	       
	        
	}

}
