package day5;

import java.util.Scanner;

public class While5 {
	
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
		System.out.println("Value of n = "+n+", Reverse = "+reverse);
	}

}
