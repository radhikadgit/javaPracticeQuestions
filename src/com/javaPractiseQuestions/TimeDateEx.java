package com.javaPractiseQuestions;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


public class TimeDateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate localDate =  LocalDate.now();
		System.out.println(localDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalDateTime dateAndTime = LocalDateTime.now();
		System.out.println(dateAndTime);
		
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("MM-dd-yy HH-mm-ss");
		String formatDateTime = dateAndTime.format(dateTimeFormat);
		System.out.println(formatDateTime);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		
		Calendar cal = Calendar.getInstance();
		 Date time = cal.getTime();
		 System.out.println(time);
		 String strCal  = cal.toString();
		 System.out.println(strCal);
		

	}

}
