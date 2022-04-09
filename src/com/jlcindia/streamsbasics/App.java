package com.jlcindia.streamsbasics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<Integer>();

		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.add(7);

		Stream<Integer> stream = myList.stream();

		System.out.println("***********************FILTER***************************");

		// stream.filter(Hello::isEven).forEach(System.out::println);

		myList.stream()
		.filter(a -> a % 2 == 0)
		.map(x->x*x)
		.forEach(a -> System.out.println(a));

		System.out.println("***********************FILTER finished***************************");
		// stream.forEach(Hello::show);
		myList.stream().forEach(System.out::println);
		System.out.println("***************LAMBDA EXPRESSION IN STREAMS ************************");

		myList.stream().forEach((x) -> System.out.println(x));

		System.out.println(
				"*************************LAMBDA EXPRESSION FINISHED********************************************");

	}
}
