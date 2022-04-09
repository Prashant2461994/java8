package com.jlcindia.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo13 {

	public static void main(String[] args) {

		List<Integer> nos = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Optional<Integer> maxEle = nos.stream().filter(num -> num % 2 != 0).map(num -> num * num)
				.max((num1, num2) -> num1.compareTo(num2));

		maxEle.ifPresent(System.out::println);

		Optional<Integer> minEle = nos.stream().filter(num -> num % 2 != 0).map(num -> num * num)
				.min((num1, num2) -> num1.compareTo(num2));

		minEle.ifPresent(System.out::println);
		
		
		  Optional<Integer> findAny = nos.stream().findAny();
		  
		  findAny.ifPresent(System.out::println);
	}
}
