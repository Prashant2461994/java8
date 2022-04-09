package com.jlcindia.streams;

import java.util.stream.Stream;

public class Demo10 {

	public static void main(String[] args) {
		Stream.iterate(101, n->n+1)
		.skip(25)
		.limit(10)
		.filter(n->n%2==0)
		.forEach(System.out::println);;
	}
}
