package com.jlcindia.optional.usecase;

import java.util.Optional;

public class Student {
	private String studentName;
	private String studentEmail;
	private String studentPhone;
	private Optional<Course> course;

	public Student(String studentName, String studentEmail, String studentPhone, Optional<Course> course) {
		super();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentPhone = studentPhone;
		this.course = course;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public Optional<Course> getCourse() {
		return course;
	}

	public void setCourse(Optional<Course> course) {
		this.course = course;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
