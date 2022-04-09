package com.jlcindia.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> numsList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Stream<Integer> stream = numsList.stream();
		Stream<Integer> oddStream = stream.filter(num -> num % 2 == 0);
		Stream<Integer> squareStream = stream.map(num -> num * num);
		squareStream.forEach(System.out::println);
	}
}
