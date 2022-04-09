package com.jlcindia.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo7 {

	public static void main(String[] args) {

		System.out.println("------------1 Stream.empty()------------");
		Stream<Integer> stream1 = Stream.empty();
		stream1.forEach(System.out::println);

		System.out.println("---------------2. Stream.of--------------");
		Stream<Integer> stream2 = Stream.of(11, 12, 13);
		stream2.forEach(System.out::println);

		System.out.println("---------------3. Collection.stream()--------------");
		List<Integer> numsList = Arrays.asList(11, 12, 13, 14, 15);
		Stream<Integer> stream3 = numsList.stream();
		stream3.forEach(System.out::println);
	
	    System.out.println("--------------------4.PARALLEL STREAM-------------------------");
	    Stream<Integer> stream4 = numsList.parallelStream();
	    stream4.forEach(System.out::println);
	}
}
