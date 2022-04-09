package com.jlcindia.optional.usecase;

import java.util.Optional;

public class Course {

	public Course() {
		super();
	}

	public Course(String courseName, double coursePrice, Optional<Trainer> trainer) {
		super();
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.trainer = trainer;
	}

	private String courseName;
	private double coursePrice;
	private Optional<Trainer> trainer;

	public String getCourseName() {
		return courseName;
	}

	public Optional<Trainer> getTrainer() {
		return trainer;
	}

	public void setTrainer(Optional<Trainer> trainer) {
		this.trainer = trainer;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

}
