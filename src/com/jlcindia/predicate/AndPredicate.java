package com.jlcindia.predicate;

import java.util.function.Predicate;

public class AndPredicate {

	public static void main(String[] args) {

		Predicate<Integer> predicat1 = (num) -> num % 2 == 0;
		Predicate<Integer> predicate2 = (num) -> num >= 25 && num <= 50;
		Predicate<Integer> predicate3 = (num) -> num % 2 != 0;
		
		//Check number is even  and between 25 and 50
		boolean myBoolean = predicat1.and(predicate2).test(19);
		System.out.println(myBoolean);
	
	
		//Check number is odd  and between 25 and 50
		boolean myBoolean2 = predicate3.and(predicate2).test(19);
		System.out.println(myBoolean2);
	
		
		//Check number is odd  or between 25 and 50
		myBoolean2 =  predicate3.or(predicate2).test(19);
		System.out.println(myBoolean2);
	}
}
