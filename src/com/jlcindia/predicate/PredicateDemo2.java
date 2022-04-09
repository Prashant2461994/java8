package com.jlcindia.predicate;

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {

		Predicate<String> predicate = Predicate.isEqual("Hello Guys");
		boolean test = predicate.test("Hello Guys");
		System.out.println(test);

		Predicate<Integer> predicate2 = Predicate.isEqual(99);
		boolean test2 = predicate2.test(88);
		System.out.println(test2);

		Predicate<Integer> isEvenPredicate = (num) -> num % 2 == 0;
		Predicate<Integer> isOddPredicate = (num) -> num % 2 == 0;
		boolean ans = isEvenPredicate.test(208);
		System.out.println(ans);
		ans =isOddPredicate.test(56);
		System.out.println(ans);
	}
}
