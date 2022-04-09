package com.jlcindia.optional.usecase;

import java.util.Optional;

public class OptionalEx {

	/** Optional class is used to provide type-level reference for the null. **/
	public static void main(String[] args) {
		Trainer trainer = new Trainer("Srinivas", "sr@jlc", "123445");
		Course course1 = new Course("Devops", 1500, Optional.ofNullable(trainer));
		Student student = new Student("Hello", "hello@gmail", "111", Optional.ofNullable(course1));

		Optional<Student> studentOptional = Optional.ofNullable(student);
		// Optional<Optional<Course>> map =
		// studentOptional.map(mystu->mystu.getCourse());
		Optional<Course> courseMap = studentOptional.flatMap(mystu -> mystu.getCourse());
		Optional<Trainer> myTrainer = courseMap.flatMap(mycourse -> mycourse.getTrainer());
		Optional<String> trainerEmail = myTrainer.map(mytra -> mytra.getTrainerEmail());
		trainerEmail.orElse("No Email is Given");

		String tainerName = studentOptional.flatMap(
			            	mystu -> mystu.getCourse().flatMap(
			            	mycou -> mycou.getTrainer().map(
			            	mytra -> mytra.getTrainerName())))
				            .orElse("No Name is Provided");

		System.out.println("Trainer Name :: " + tainerName);

	}
}
