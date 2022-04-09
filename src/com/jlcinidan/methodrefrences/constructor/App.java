package com.jlcinidan.methodrefrences.constructor;

public class App {

	public static void main(String[] args) {

		Test test = (a, b, c, d) -> {
			Course mycourse = new Course(a, b, c, d);
			return mycourse;
		};

		Course course = test.test(101, "Devops", 150000, "Srinivas Dande");
		System.out.println(course);

		Test test2 = Course::new;
		Course cou2 = test2.test(102, "Prashant", 2000000, "Prashant Kumar");
		System.out.println(cou2);

	}
}
