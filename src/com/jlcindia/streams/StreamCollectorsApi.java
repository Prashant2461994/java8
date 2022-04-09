package com.jlcindia.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectorsApi {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		Long count = list.stream().filter(num -> num % 2 == 0).collect(Collectors.counting());
		System.out.println("Count::" + count);

		Integer sumResult = list.stream().filter(num -> num % 2 == 0)
				.collect(Collectors.reducing(0, (num1, num2) -> num1 + num2));
		System.out.println("sum ::: " + sumResult);

		List<String> courses = Arrays.asList("Java", "SpringBoot", "Devops");
		String joinResult = courses.stream().collect(Collectors.joining("--"));

		System.out.println("JoinResult ::: " + joinResult);
	}
}
