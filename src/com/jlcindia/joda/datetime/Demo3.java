package com.jlcindia.joda.datetime;

import java.time.LocalTime;

public class Demo3 {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		LocalTime time1 = LocalTime.parse("02:08:25");
		System.out.println(time1);
		
		LocalTime time2 = LocalTime.of(2,8,22);
		System.out.println(time2);
		System.out.println("********************************************************************************");
		System.out.println("HOUR :: "+time2.getHour());
		System.out.println("MINUTE :: "+time2.getMinute());
		System.out.println("SECOND :: "+time2.getSecond());
		System.out.println("NANO ::"+time2.getNano());
	
	}
}
