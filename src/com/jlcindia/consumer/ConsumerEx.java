package com.jlcindia.consumer;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerEx {

	public static void main(String[] args) {

		Consumer<String> fun1 = (inp) -> {
			System.out.println(inp + "fun1---Consumer1");
		};

		Consumer<String> fun2 = (inp) -> {
			System.out.println(inp + "fun2-Consumer2");
		};

		fun1.andThen(fun2).accept("----");;
		
		
		Supplier<String> fin3 = ()->"hello";
			
		System.out.println(fin3.get());

	}
}
