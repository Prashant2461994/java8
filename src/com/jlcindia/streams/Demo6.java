package com.jlcindia.streams;

import java.util.Arrays;
import java.util.List;

public class Demo6 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,1, 2, 3, 4,5,6,7,8,9,10,11,12,13,14,15,16,16,16,17,18,19,20);
		list.
		 stream()
		.distinct()
		.limit(15)
		//.peek(System.out::println)
		.map(num -> num * 1)
		.sorted()
		.forEach(System.out::println);
	}
}
