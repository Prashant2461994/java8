package com.jlcindia.optional.dedicated;

import java.util.Optional;

public class OptionalOfWithNull {
// Optional.of() with null
	public static void main(String[] args) {
		String str = null;
		Optional<String> myOpts = Optional.of(str);
		System.out.println("1. " + myOpts);
	}
}
