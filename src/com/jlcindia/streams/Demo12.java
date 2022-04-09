package com.jlcindia.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo12 {

	public static void main(String[] args) {

		List<Integer> numsList = Arrays.asList(1, 2, 3, 4, 5);
		int sumResult1 = numsList.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sumResult1);

		System.out.println("---------------------");
		int sumResult2 = numsList.stream().reduce(0, Integer::sum);
		System.out.println(sumResult2);

		System.out.println("------------------------");

		Integer mulResult = numsList.stream().reduce(0, (a, b) -> a * b);
		System.out.println(mulResult);

		System.out.println("------------------------");

		Integer lastElement = numsList.stream().reduce((num1, num2) -> num2).orElse(-1);
		System.out.println(lastElement);
		System.out.println("------------------------");

		Integer firstEle = numsList.stream().reduce((num1, num2) -> num1).orElse(-1);
		System.out.println(firstEle);

		System.out.println("------------------------");
		Integer sum = numsList.stream().reduce((num1, num2) -> num1 + num2).orElse(-1);
		System.out.println(sum);

		System.out.println("------------------------");
		Optional<Integer> sumOptional = numsList.stream().reduce((num1, num2) -> num1 + num2);
		sumOptional.ifPresent(System.out::println);

		System.out.println("------------------------");
		Optional<Integer> mulOptional = numsList.stream().reduce((num1, num2) -> num1 * num2);
		mulOptional.ifPresent(System.out::println);
	}
}
