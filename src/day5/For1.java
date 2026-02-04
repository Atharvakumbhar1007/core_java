package day5;

import java.util.Scanner;

public class For1 {

	// IT USED WHEN WE ALREADY KNOW THE END(SOLUTION)
	// END / ARRAY / COLLECTION / STRING
	
	public static void main (String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		for(int i = 1; 1 <= n; i++) {
			int cube = i * i * i;
			System.out.println("The cube of "+i+" = "+cube);
		}
	}
}
