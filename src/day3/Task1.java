package day3;

import java.util.Scanner;

// WAP to check whether the number contain 3 digit or not
// number can be positive or negative 
public class Task1 {
	
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter a number:"); 
		num = sc.nextInt();
		
		 if ((num >= 100 && num <= 999) || (num <= -100 && num >= -999)) {
	            System.out.println( " is a 3-digit number" +num);
	        } else {
	            System.out.println(" is NOT a 3-digit number"+num);
		}
	}
}
