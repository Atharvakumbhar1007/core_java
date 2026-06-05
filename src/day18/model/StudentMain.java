package day18.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentMain {

		
		private static List<Student> students;

		public static void main(String[] args) {
			List<Student> student = new ArrayList<Student>();
			
			students.add(new Student(10, "Shravani Kumbhar","Bio Tech",98.97));
			students.add(new Student(9, "Om Ramjji","IT",68.97));
			students.add(new Student(1, "Dharma Limbu","ESTC",88.97));
			students.add(new Student(18, "virat kohli","CS",38.97));
			
			System.out.println("Before sorting by  roll no");
			students.forEach(stud-> System.out.println(stud));
			
			
			
//			students.sort(null);
//			System.out.println("After sorting by roll no");
//			students.forEach(stud-> System.out.println(stud));
			
			students.sort(Collections.reverseOrder());
    		System.out.println("After sorting by roll no in DESC");
			students.forEach(stud-> System.out.println(stud));
		
	}
}
