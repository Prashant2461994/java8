package com.jlcindia.function;

import java.util.function.Function;

public class FunctionEx {

	public static void main(String[] args) {
		/** Function apply */
		Function<String, String> fun1 = (input) -> input.toUpperCase();
		String res = fun1.apply("launde ka baal");
		System.out.println("Result -->" + res);

		Function<String, Integer> fun2 = (input) -> Integer.parseInt(input);
		Integer output = fun2.apply("99");

		System.out.println(output);

		/** Identity Method **/
		Function<String, String> fun3 = Function.identity();
		System.out.println(fun3.apply("You will get what you will sow"));

		Function<Integer, Integer> fun4 = num -> 3 * num;
		System.out.println(fun4.apply(5));

		Function<Integer, Integer> fun5 = num -> 6 * num;
		System.out.println(fun5.apply(5));

		/* COMPOSE */
		int result1 = fun4.compose(fun5).apply(7); /**Here fun5 will be applied first then fun4;**/
		int result2 = fun4.andThen(fun5).apply(7); /**Here fun4 will be applied first then fun5;**/
		System.out.println(result1);
		System.out.println(result2);

	}
}
