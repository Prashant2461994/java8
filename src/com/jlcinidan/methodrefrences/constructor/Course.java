package com.jlcinidan.methodrefrences.constructor;

public class Course {

	private int courseId;
	private String courseName;
	private double price;
	private String trainer;
	
	public Course(String courseName, double price, String trainer) {
		super();
		this.courseName = courseName;
		this.price = price;
		this.trainer = trainer;
	}
	
	public Course(int courseId, String courseName, double price, String trainer) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.price = price;
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", price=" + price + ", trainer="
				+ trainer + "]";
	}

	public Course() {
		super();
	}

	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}


}
