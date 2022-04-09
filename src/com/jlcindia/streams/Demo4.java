package com.jlcindia.streams;

import java.util.Arrays;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {

		List<Integer> mylist = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
	
		mylist.stream()
		       .limit(10)
		       .filter(num -> num % 2 == 0)
		       .map(num->num*num)
		       .forEach(System.out::println);

	}
}
