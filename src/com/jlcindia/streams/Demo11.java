package com.jlcindia.streams;

import java.util.Random;
import java.util.stream.Stream;

public class Demo11 {
	public static void main(String[] args) {
		Stream.generate(() -> new Random().nextInt(100)).limit(10).forEach(System.out::println);
	}
}
