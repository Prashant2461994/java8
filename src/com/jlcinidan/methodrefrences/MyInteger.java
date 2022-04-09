package com.jlcinidan.methodrefrences;

public class MyInteger {

	public static int findSum(int a, int b) {
		System.out.println("Total sum is ::: " + (a + b));
		return a + b;
	}
	
	

	public  int findSumIns(int a, int b) {
		System.out.println("Instance Refrence ::: " + (a + b));
		return a + b;
	}
}
