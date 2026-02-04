package day5;

import java.util.Scanner;

public class While6 {
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		
		int i = n, reverse = 0;
		
		while(i != 0) {
			int lastdigit = i % 10;
			
			reverse = reverse * 10 + lastdigit;
			
			i = i / 10;
			
		}
		if(reverse == n) {
			System.out.println("Number = "+n+" is a palindrome");
		}else
		System.out.println("Number = "+n+" is NOT a palindrome,"
				+ "Since reverse ="+reverse);
	}

}
