package com.jlcinidan.methodrefrences;

public class Demo2 {

	void show() {
		/*Anonymous class*/
		Hello h = new Hello() {
			public int test(int a, int b) {
				return a + b;
			};
		};
	}
}
