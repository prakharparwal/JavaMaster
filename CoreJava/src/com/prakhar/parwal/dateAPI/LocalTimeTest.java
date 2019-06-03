package com.prakhar.parwal.dateAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class LocalTimeTest 
{
	public static void main(String... q)
	{
		LocalTime localtime = LocalTime.now();
		System.out.println("NOW: "+localtime);
		
		LocalTime givenTime = LocalTime.of(13, 13);
		System.out.println("Give date"+givenTime);
		
		/*LocalDate exceptionDate = LocalDate.of(2014, Month.FEBRUARY, 29);
		System.out.println("Exception date "+exceptionDate);*/
		
		LocalDate dateByZoneId = LocalDate.now(ZoneId.of("US/Arizona"));
		System.out.println("Date of arizona "+dateByZoneId);
		
		//Exception of zone id 
		
		//Getting date from base date i.e. 1/1/1970
		LocalDate dateFromBaseDate = LocalDate.ofEpochDay(2);
		System.out.println("Date from base date"+dateFromBaseDate);
		
		LocalDate specificDayOfYear = LocalDate.ofYearDay(2018, 3);
		System.out.println("Day of specific year"+specificDayOfYear);

	}
}
