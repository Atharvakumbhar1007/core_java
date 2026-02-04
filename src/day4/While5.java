package day4;

import java.util.Scanner;

//WAP to print sum of digits
//n = 183 -> 3 + 8 + 1 = 12
public class While5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int i = n;
		int sum = 0, lastdigit;
		while( i != 0) {
			
			lastdigit = i % 10;
			sum = sum + lastdigit;
			
			// decrement -> 10 (Log)
			i = i / 10;
		}
		System.out.println("The Sum of digit of "+n+" = "+sum);
	}
}
