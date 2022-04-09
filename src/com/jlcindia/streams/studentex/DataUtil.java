package com.jlcindia.streams.studentex;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {

	public static List<Student> getStudentList() {
		
		List<Student> studentList = new ArrayList<Student>();
		Student stu1 = new Student(101, "sri", 555, "Devops", 15000, 100);
		Student stu2 = new Student(102, "vas", 333, "Devops", 15001, 200);
		Student stu3 = new Student(103, "sd", 777, "SpringBoot", 15002, 300);
		Student stu4 = new Student(104, "ds", 222, "Spring", 15003, 400);
		Student stu5 = new Student(105, "hello", 111, "Spring", 15004, 500);
		Student stu6 = new Student(106, "aaa", 666, "Spring", 15005, 600);
		Student stu7 = new Student(107, "hai", 444, "Spring Intermediate", 15006, 700);
		Student stu8 = new Student(108, "bbb", 123, "Spring Intermediate", 15007, 800);
		Student stu9 = new Student(109, "ccc", 321, "SpringBoot", 15008, 900);

		studentList.add(stu9);
		studentList.add(stu8);
		studentList.add(stu7);
		studentList.add(stu6);
		studentList.add(stu5);
		studentList.add(stu4);
		studentList.add(stu3);
		studentList.add(stu2);
		studentList.add(stu1);

		return studentList;
	}
}
