package com.jlcinidan.methodrefrences;

public class Main {

	public static void main(String[] args) {

		Hello h1 = MyInteger::findSum;
		h1.test(5, 6);

		Hello h2 = Integer::sum;
		MyInteger myInt = new MyInteger();
		Hello h3 = myInt::findSumIns;
		h3.test(8, 9);

	}
}
