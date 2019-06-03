package com.prakhar.parwal.dateAPI;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateTest 
{
	public static void main(String...strings)
	{
		LocalDate localDate = LocalDate.now();
		System.out.println("NOW: "+localDate);
		
		LocalDate givenDate = LocalDate.of(2017, Month.JANUARY,	1);
		System.out.println("Give date"+givenDate);
		
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
