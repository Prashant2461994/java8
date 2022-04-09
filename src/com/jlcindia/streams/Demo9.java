package com.jlcindia.streams;

import java.util.stream.Stream;

public class Demo9 {

	public static void main(String[] args) {
		/****
		 * int i = 11 , i++
		 ****/
		 Stream<Integer> iterateStream = Stream.iterate(11, n->n+1);
		 
		 iterateStream
		.limit(10)
		.forEach(System.out::println);
		
	}
}
