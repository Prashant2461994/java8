package com.jlcindia.streams;

import java.util.Arrays;
import java.util.List;

public class Demo5 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);

		list.stream().skip(5).limit(9).forEach(System.out::println);

		list.stream()
		    .skip(4)
		    .limit(9)
		    .filter(num -> num % 2 == 0)
		    .map(num1 -> num1 * num1)
		    .forEach(System.out::println);
	}
}
