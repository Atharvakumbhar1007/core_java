package day16;

import java.util.ArrayList;

import day16.model.Student;

public class ArrayListEx3 {

	public static void main(String[] args) {
	
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Atharva Kumbhar",10001,"Male",85.55));
		students.add(new Student("Shravani Kumbhar",10002,"Female",95.55));
		students.add(new Student("Riya Shaha",10003,"Female",75.55));
		students.add(new Student("Sakshi Ranaware",10004,"Female",75.55));
		students.add(new Student("Om Shinde",10005,"Male",65.55));
		students.add(new Student("Shashank  Kumar",10006,"Male",85.55));
		
		System.out.println("All students are: ");
		for(Student theStudent: students) {
			System.out.println(theStudent);
		}
		
	}
}
