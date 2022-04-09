package com.jlcindia.optional.dedicated;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalFilter {

	public static void main(String[] args) {

		// String str = null;
		String str1 = null;
		Optional<String> myopts1 = Optional.ofNullable(str1);
		Optional<String> myopts2 = myopts1.filter(input -> input.contains("Sri"));
		System.out.println(myopts2);

		String str2 = "Srinivas1";
		Optional<String> myopts3 = Optional.ofNullable(str2);
		Optional<String> myopts4 = myopts3.filter(input -> input.contains("Sri"));
		System.out.println(myopts4);

		String str3 = "Srinivas2";
		Optional<String> myopts5 = Optional.ofNullable(str3);
		Optional<String> myopts6 = myopts5.filter(input -> input.contains("Sri"));
		System.out.println(myopts6);

		String str4 = "SEXY BOYS";
		Optional<String> myopts7 = Optional.ofNullable(str4);
		Optional<String> myopts8 = myopts7.filter(input -> input.contains("Sri"));
		System.out.println(myopts8);

	
		/***
		 * filter() Case 1: Optional Object is empty ---------------------------------
		 * =>Predicate Logic will not run. =>Return Empty optional object.
		 * 
		 * Case 2: Optional Object is not Empty ------------------------------------
		 * =>PredicateLogic will run
		 *
		 * =>If Predicate returns true then => Return Optional object with given value
		 * 
		 * => If Predicate return false then => Return Empty Optional Object
		 * 
		 * 
		 ************/
	}
}
