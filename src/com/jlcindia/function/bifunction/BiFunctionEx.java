package com.jlcindia.function.bifunction;

import java.util.function.BiFunction;

public class BiFunctionEx {

	public static void main(String[] args) {

		BiFunction<String, String, String> bifun1= (input1 ,input2)->input1+input2;
		String res = bifun1.apply("Hello-", "Guys");
		System.out.println(res);
		
		BiFunction<Integer,Integer,String> fun3 =(num1,num2)->{
			int result = num1*num2;
			return result+" = RESULT";
		};
		
		System.out.println(fun3.apply(54, 56));
		
	}
}
