package com.jlcindia.optional.dedicated;

import java.util.Optional;

public class OptionalOfEx {

	public static void main(String[] args) {
		String str = "Srinivas";
		//String str = null;
		Optional<String> myOpts = Optional.of(str);

		System.out.println("1. " + myOpts);
		System.out.println("2. " + myOpts.orElse("Hello Guys"));
		System.out.println("3. " + myOpts);
		System.out.println("4. " + myOpts.isPresent());
        System.out.println("5. " + myOpts.get());

		if (myOpts.isPresent()) {
			System.out.println("6. " + myOpts.get());
		} else {
			System.out.println("No value Found");
		}
	}
}
