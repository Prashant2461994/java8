package com.jlcindia.joda.datetime;

import java.time.LocalDateTime;

public class Demo4 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime datetime1 = LocalDateTime.parse("2021-08-22T02:10:45");
		System.out.println(datetime1);
	
		LocalDateTime datetime2 = LocalDateTime.of(2021, 2, 23, 23, 42);
		System.out.println(datetime2);
		
		 
	}
}
