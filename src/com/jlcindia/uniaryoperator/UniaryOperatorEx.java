package com.jlcindia.uniaryoperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UniaryOperatorEx {

	public static void main(String[] args) {

		Function<String, String> fun1 = (input) -> input.toUpperCase();
		System.out.println(fun1.apply("Hello"));

		/** UniaryOpeartor is subtype of a Function Interface **/
		UnaryOperator<String> unary1 = (input) -> input.toUpperCase();
		System.out.println(unary1.apply("Hello"));

		Function<Integer,Integer> fun2 = (num)-> num*2;
		System.out.print(fun2.apply(20));
		
		
		UnaryOperator<String> fun3 = str-> str.toUpperCase();
		System.out.print(fun3.apply("aspdasopdasopdjasopdj"));
		
	}
}
