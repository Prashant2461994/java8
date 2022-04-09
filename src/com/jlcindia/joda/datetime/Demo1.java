package com.jlcindia.joda.datetime;

import java.util.Date;

public class Demo1 {
	/** Old Approach **/

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);

		/* Wrong date */
		Date mydate = new Date(2021, 8, 22, 1, 50);
		/* Month starts with 0 **/
		/* 1.Also we need to minus 1900 from current year */
		/* 2.Date starts from 1 */
		/*
		 * 3.Date objects are mutable- It is not thread safe (Both date and calender are
		 * not Thread safe)
		 */
		System.out.println(mydate);

		/* Correction for above date */
		mydate = new Date(2021 - 1900, 7, 22, 1, 50);
		System.out.println(mydate);

		/**
		 * Since java date had these many date issues with above java date api , people
		 * started using third party date api called joda. To avoid people from using
		 * third party api java integrated joda with java 8 in java.time package
		 **/
	}
}
