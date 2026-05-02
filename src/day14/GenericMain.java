package day14;

import java.net.ResponseCache;
import java.util.Scanner;
 
import day9.derived.Student;

/*
 * num div by 3 and 5 both -> set msg to FIZZBUZZ
 * NUM DIV BY 3 -> SET MSG TO FIZZ
 * num div by 5 -> Set msg to BUZZ
 * num not div by 3 and 5 -> Set msg to num*/
public class GenericMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		Response<Object> response = new Response();
		if(n % 3== 0 && n % 5 == 0) {
			response.setMsg("FIZZBUZZ");
		}else if(n % 3 == 0) {
			response.setMsg("FIZZ");
		}else if(n % 5 == 0) {
			response.setMsg("BUZZ");
		}else {
			response.setMsg(n);
		}
		System.out.println(response);
		
		Student student = new Student(10,"Male","Atharva Kumbhar",1001 ,85.58);
		
		Response<Student> response2= new Response<Student>();
		
		response2.setMsg(student);
		System.out.println(response2);
		
	}
}
