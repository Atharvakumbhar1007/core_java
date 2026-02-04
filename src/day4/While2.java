package day4;

import java.util.Scanner;

// WAP to print first n natural number in reverse order
public class While2 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int i = n; //start
		while(i >= 10) {
			System.out.println(i + "\t");
			i--;
		}
		
	}
}
