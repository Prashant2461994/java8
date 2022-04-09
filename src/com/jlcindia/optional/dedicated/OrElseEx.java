package com.jlcindia.optional.dedicated;

import java.util.Optional;

public class OrElseEx {

	public static void main(String[] args) throws NoSuchFieldException {

		String str = "Srinivas";
		Optional<String> strOptional = Optional.ofNullable(str);
		System.out.println("1. " + strOptional);
		System.out.println("2. " + strOptional.orElse("Hello Guys"));
		System.out.println("3. " + strOptional.orElseGet(()->"Ok Guys"+str));
		strOptional.orElseThrow(NoSuchFieldException::new);
		
		
		
		String str1 = null;
		Optional<String> str1Optional = Optional.ofNullable(str1);
		System.out.println("1. " + str1Optional);
		System.out.println("2. " + str1Optional.orElse("Hello Guys"));
		System.out.println("3. " + str1Optional.orElseGet(()->"Ok Guys"+str));
		System.out.println("4. " + str1Optional.orElseThrow(NoSuchFieldException::new));
	
	}
}
