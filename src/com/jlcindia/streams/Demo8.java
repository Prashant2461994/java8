package com.jlcindia.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Demo8 {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(11, 12, 13);
		Stream<Integer> stream2 = Arrays.asList(21, 22, 23).stream();
		Stream<Integer> stream3 = Stream.concat(stream, stream2);
		stream3.forEach(System.out::println);
	}
}
