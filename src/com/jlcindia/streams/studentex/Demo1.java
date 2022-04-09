package com.jlcindia.streams.studentex;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class StuNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getSname().compareTo(o2.getSname());
	}

}

public class Demo1 {

	public static void main(String[] args) {
		List<Student> studentList = DataUtil.getStudentList();
		studentList.forEach(System.out::println);

		System.out.println("------------------------------------------");

		studentList.stream().sorted((stu1, stu2) -> stu1.getSname().compareTo(stu2.getSname()))
				.forEach(System.out::println);

		System.out.println("------------------------------------------");

		studentList.stream().filter(stu -> stu.getFeeBal() > 0).forEach(System.out::println);

		System.out.println("------------------------------------------");

		studentList.stream().sorted(new StuNameComparator()).forEach(System.out::println);

		/***
		 * Display the students who has to pay the Fee Balance in the descneding order
		 * by name and collect in list
		 * 
		 * *
		 */
		System.out.println("------------------------------------------");
		List<Student> studentsWithNoBalFee = studentList.stream().filter(stu -> stu.getFeeBal() > 0)
				.sorted((stu1, stu2) -> stu2.getSname().compareTo(stu2.getSname())).collect(Collectors.toList());

		/***
		 * Display the students who has to pay the Fee Balance >=12000 and add fine of
		 * Rs.1000 and sort them in order of FeeBal
		 ***/

		studentList.stream().filter(stu -> stu.getFeeBal() >= 12000).map(stu -> {
			stu.setFeeBal(stu.getFeeBal() + 1000);
			return stu;
		}).collect(Collectors.toList());

		studentList.forEach(System.out::println);
		System.out.println("------------------------------------------");

		/***
		 * Which student FeePaid is high ??? Max
		 ***/

		Optional<Student> maxFeePaid = studentList.stream().max((stu1, stu2) -> {
			int max = (int) (stu1.getFeePaid() - stu2.getFeePaid());
			return max;
		});

		Optional<Student> maxFeeOptional = studentList.stream().collect(Collectors.maxBy((stu1, stu2) -> {
			return (int) (stu1.getFeeBal() - stu2.getFeeBal());
		}));

		maxFeePaid.ifPresent(System.out::println);
		maxFeeOptional.ifPresent(System.out::println);
		/***
		 * Which student FeePaid is Low ??? min
		 ***/

		Optional<Student> minFeePaid = studentList.stream().min((stu1, stu2) -> {
			int min = (int) (stu1.getFeePaid() - stu2.getFeePaid());
			return min;
		});

		/***
		 * GroupBy -------- Display students course wise
		 ***/

		System.out.print("-----------------------------------------------------------------------------------------");
		Map<String, List<Student>> stuMap = studentList.stream().collect(Collectors.groupingBy(Student::getCourseName));

		for (String cname : stuMap.keySet()) {
			List<Student> list = stuMap.get(cname);
			list.forEach(stu -> System.out
					.println("Student name :: " + stu.getSname() + " $$$ course name ::: " + stu.getCourseName()));
		}

		/***
		 * Partioning -------- Display students course wise feeBal is 0
		 ***/

		Map<Boolean, List<Student>> stuMapFeeBalGreaterThan0 = studentList.stream()
				.collect(Collectors.partitioningBy(stu -> stu.getFeeBal() == 0));

		for (Boolean cname : stuMapFeeBalGreaterThan0.keySet()) {

			List<Student> list = stuMapFeeBalGreaterThan0.get(cname);
			list.forEach(stu -> System.out
					.println("Student name :: " + stu.getSname() + " $$$ course name ::: " + stu.getCourseName()));
		}

		Double totalBalFee = studentList.stream().collect(Collectors.summingDouble(Student::getFeeBal));
		System.out.println("Total Balance Fee :::" + totalBalFee);

		/***
		 *TotalFeePaidCourseWise
		 ***/
		
		 Map<String, Double> feeBalMap = studentList.stream()
				                                    .collect(
				                                    		Collectors.groupingBy(Student::getCourseName,
				                                    		Collectors.summingDouble(Student::getFeeBal)
				                                    		));
		 
		 
		 for(String courseName:feeBalMap.keySet()) {
			 System.out.println(courseName+"::::::::::::::::"+feeBalMap.get(courseName));
		 }
		
		    /**
			 *Limitation of reduce :
			 ***/
	
			/*
			 * studentList.stream().reduce((stu1,stu2)->stu1.getFeeBal()+stu2.getFeeBal());
			 */
	
		 /**NOTE ::: BELOW APPROACH IS VERY SLOW FIRST WE ARE APPLYING MAP ON EACH ELEMENT THEN REDUCE*/
		 Double totalFeeBal = studentList.stream()
		 .map(stu -> stu.getFeeBal())
		 .reduce(0.0,(bal1,bal2) -> bal1+bal2);
		 
		 System.out.println("mybal ::: "+totalFeeBal);
	}
}
