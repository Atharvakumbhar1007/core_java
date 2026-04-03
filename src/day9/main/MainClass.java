package day9.main;

import day9.derived.Student;

public class MainClass {
	
	public static void main(String[] args) {
		Student s1 = new Student();

	s1.setAge(25);
	s1.setGender("Female");
	s1.setName("Parvati");
	s1.setPercentage(98.97);
	s1.setRollNo(10);
	
	Student s2 = new Student(15, "Male","Rohit",88,45);
	
	System.out.println(s1);
	System.out.println(s2);
	}  
}