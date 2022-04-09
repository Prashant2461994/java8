package com.jlcinidan.methodrefrences;

public class Demo1 extends A {

	int y = 100;

	void show() {
		
		Hello h1 = (a, b) -> {
			int sum = a + b;
			sum = sum + x + y;
			return sum;
		};
	
	}
}
