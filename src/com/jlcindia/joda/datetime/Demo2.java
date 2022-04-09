package com.jlcindia.joda.datetime;

import java.time.LocalDate;

public class Demo2 {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();
		//System.out.println(now);

		
		LocalDate date2 = LocalDate.of(2021, 1, 31);
		//System.out.println(date2);
		
		LocalDate date1 = LocalDate.parse("2021-01-01");
		System.out.println("YEAR ::: "+date1.getYear());
		System.out.println("DAY OF YEAR ::: "+date1.getDayOfYear());
		System.out.println("MONTH ::: "+date1.getMonth());
		System.out.println("DAY OF MONTH ::: "+date1.getDayOfMonth());
		System.out.println("DAY OF WEEK ::: "+date1.getDayOfWeek());
		
		
		
	}
}
