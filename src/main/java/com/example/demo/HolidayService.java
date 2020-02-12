package com.example.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HolidayService {

	public static boolean isSaturdayOrSundayOrHoliday() {
		Calendar cal = Calendar.getInstance();
		if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			System.out.println("Sunday!");
			return true;
		}
	
		if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
			System.out.println("Saturday!");
			return true;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date parsedDate = null;
		String date = "";
		Date original = null;
		for (String holidayDate : Holidays.MARKET_HOLIDAYS) {
			try {
				parsedDate = sdf.parse(holidayDate);
				date =  sdf.format(new Date());
				original = sdf.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(parsedDate.equals(original)){
				return true;
			}
		}
		return false;
	
	}
	

}
