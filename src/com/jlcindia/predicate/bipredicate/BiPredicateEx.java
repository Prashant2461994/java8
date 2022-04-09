package com.jlcindia.predicate.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateEx {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> biPredicate1 = (num1, num2) -> num1 > num2;
		BiPredicate<Integer, Integer> biPredicate2 = (num1, num2) -> num1 < num2;

		boolean myBool = biPredicate1.test(10, 20);
		
		System.out.println(myBool);
		
		myBool = biPredicate2.test(10, 20);
		
		System.out.println(myBool);
	}
}
