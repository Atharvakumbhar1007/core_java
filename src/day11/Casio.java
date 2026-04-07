package day11;

import java.util.Scanner;

public class Casio {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter number 1: ");
		n1=sc.nextInt();
		System.out.println("Enter number 2: ");
		n2=sc.nextInt();
		
		System.out.println("Select\n1. Addition\n2. "
				+ "Subtraction\n3. Mutiplication\n4.Division");
		
		int choice = sc.nextInt();
		
		Calculator calculator = new Calculator();
		switch (choice) {
		case 1: {
			calculator.addition(n1, n2);
			break;
		}
		case 2: {
			calculator.subtraction(n1, n2);
			break;
		}
		case 1: {
			calculator.multiplication(n1, n2);
			break;
		}
		case 1: {
			calculator.division(n1, n2);
			break;
		}
		default:
			System.out.printl("Invalid Choice")
		}
	}
}
