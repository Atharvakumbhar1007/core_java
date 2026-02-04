package day4;

import java.util.Scanner;

//WAP to print factorial of n

public class While3 {
	
	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num = sc.nextInt();
	
		int i = num;
		int fact = 1;
		
		while (i >= 1) {
			fact = fact * 1;
			i--;
		}
		System.out.println("Factorial is: " + fact);
	}
}
