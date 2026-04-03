package day9.main;

import day9.derived.Student;

public class MainClass {
	
	public static void main(String[] args) {
		Student student = new Student();

	student.setAge(25);
	student.setGender("Female");
	student.setName("Parvati");
	student.setPercentage(98.97);
	student.setRollNo(10);
	
	System.out.println(student);
	
	}
}
