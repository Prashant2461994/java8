package com.jlcinidan.lambdaexpression;

public class Main {

	public static void  main(String[] args) {
		Hello h1 = (a,b)->{
			System.out.println("Total sum is "+(a+b));
		};
		
		h1.test(4, 5);
	}
}
