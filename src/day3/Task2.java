package day3;

import java.util.Scanner;

//WAP to check last digit of number is divisible by 3 or not 
//Ex: n = 189, last digit =9 ->number: 189, lastdigit: 9 is divisible by 3
public class Task2 {
		
public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:"); 
		int num = sc.nextInt();
		
		int lastdigit = num % 10;
		
		if(lastdigit < 0) {
			lastdigit = - lastdigit;
		}
		if(lastdigit % 3 == 0) {
			System.out.println("Lastdigit is divisible by 3");
		}
		else {
			System.out.println("Lastdigit is not divisible by 3");
		}
	}
}
