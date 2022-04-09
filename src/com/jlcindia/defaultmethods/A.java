package com.jlcindia.defaultmethods;

public interface A {

	public static void m1() {
		System.out.println("A-M1() called of interface A");
	}
	
	
	default void m2() {
		System.out.println("This is default method of interface A");
	}
}
