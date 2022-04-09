package com.jlcindia.optional.dedicated;

import java.util.Optional;

public class OptionalMap {

	public static void main(String[] args) {
		String str = "srinivas";
		Optional<String> myopts = Optional.ofNullable(str);
		System.out.println("1." + myopts);

		Optional<String> myopts2 = myopts.map(input -> input);
		System.out.println("2." + myopts2);

		Optional<String> myopts3 = myopts2.map(input -> input.toUpperCase());
		System.out.println("3." + myopts3);

		Optional<String> myopts4 = myopts3.map(input -> new StringBuilder(input).reverse().toString());
		System.out.println("4." + myopts4);

		String str2 = null;
		Optional<String> myopts5 = Optional.ofNullable(str2);
		System.out.println("5." + myopts5);

		Optional<String> myopts6 = myopts5.map(input -> input.toUpperCase());
		System.out.println("6." + myopts6);
		System.out.println("!!!! DONE !!!!");

	}

}
