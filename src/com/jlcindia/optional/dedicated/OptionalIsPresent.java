package com.jlcindia.optional.dedicated;

import java.util.Optional;

public class OptionalIsPresent {

	public static void main(String[] args) {

		String str1 = null;
		String str2 = "Srinivas";
		String str3 = "Srinivas";
		Optional<String> myopts = Optional.ofNullable(str1);

		if (myopts.isPresent()) {
			System.out.println(myopts.get());
		}

		System.out.println("----------------------------------------------------");
		/*** CORRECT WAY OF USING CONSUMER **/
		myopts.ifPresent(input -> System.out.println(input.toUpperCase()));
		/*** CORRECT WAY OF USING CONSUMER **/

		myopts.filter(input -> input.contains("Sri"));
		
		
		
	}
}
