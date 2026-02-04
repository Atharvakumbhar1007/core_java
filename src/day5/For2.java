package day5;

import java.util.Scanner;

public class For2 {

	// WAP to print fibonacci series till n
	// n = 10
	// 0 1 1 2 3 5 8 13 21 34
	
	public static void main (String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to display fibonacci series: ");
		int n = sc.nextInt();
		
		int n1 = 0, n2 = 1;
		
		if(n > 0) {
			System.out.println("Fibonacci series till "+n+": \n" );
			if(n > 0) {
				System.out.println(n1+" "+n2+" ");
			}
		}
		else {
			System.out.println("Enter positive number to generaye series");
		}
		for(int i = 3; i <= n; i++) {
			int n3 = n1 + n2;
			System.out.println(n3 +" ");
			
			//swap
			n1 = n2;
			n2 = n3;
		}
	}
}
