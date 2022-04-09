package com.jlcindia.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo2 {
	/** 1. Streams will not store any data 
	 *  2. Streams does not modify the source **/

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		list.stream().filter(num -> num % 2 == 0).map(num -> num * num).forEach(System.out::println);
        
	}
}
