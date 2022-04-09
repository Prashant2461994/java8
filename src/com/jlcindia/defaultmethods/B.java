package com.jlcindia.defaultmethods;

public interface B {
	static void m1() {
		System.out.println("B-M1() called of interface B");
	}

	/*
	 * default void m2() {
	 * System.out.println("This is default method of interface B"); }
	 */
	
	
	
	public static void main(String[] args) {
		System.out.println(" Now we can also write main method inside interface");
	}
}
