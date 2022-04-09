package com.jlcindia.streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo14 {
	public static void main(String[] args) {

		List<Integer> numsList = Arrays.asList(5, 4, 6, 55, 99, 12, 56);
		List<Integer> collectedList = numsList.stream().filter(num -> num % 2 == 0).map(num -> num * num).sorted()
				.collect(Collectors.toList());

		List<Integer> linkedListCollect = numsList.stream()
				                                   .filter(num -> num % 2 == 0)
				                                   .map(num -> num * num)
				                                   .sorted()
				                                   .collect(Collectors.toCollection(LinkedList::new));

	}
}
