package com.jlcindia.optional.dedicated;

import java.util.Optional;

public class OptionalisEmpty {

	public static void main(String[] args) {
		Optional<String> myOpts = Optional.empty();
		
		System.out.println("1. " + myOpts);
		System.out.println("2. " + myOpts.orElse("Hello Guys"));
		System.out.println("3. " + myOpts);
		System.out.println("4. " + myOpts.isPresent());
	//	System.out.println("5. " + myOpts.get());
		
		
		
		
		if(myOpts.isPresent()) {
			System.out.println("5."+myOpts.get());
		}else {
			System.out.println("No value Found");
		}
	}
}
