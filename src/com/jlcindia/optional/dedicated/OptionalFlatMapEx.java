package com.jlcindia.optional.dedicated;

import java.util.Optional;

public class OptionalFlatMapEx {

	public static void main(String[] args) {
		String str1 = "Srinivas";
		Optional<Optional<String>> myopts1 = Optional.of(Optional.ofNullable(str1));
		System.out.println("1." + myopts1);
		System.out.println("2." + myopts1.map(input -> input));
		System.out.println("3." + myopts1.flatMap(input -> input));
		System.out.println("-----------------------------------------------------");

		Optional<Optional<String>> myopts2 = myopts1.map(input -> input.map(input2 -> input2.toLowerCase()));
		System.out.println("4." + myopts2);
		Optional<String> flatMapMyOpts = myopts1.flatMap(input -> input.map(input2 -> input2.toLowerCase()));
		System.out.println("5." + flatMapMyOpts);
	}
}
