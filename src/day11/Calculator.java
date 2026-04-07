package day11;

import java.util.Scanner;

public class Calculator {
    
	public static String brand = "Casio";
	
    // Methods
    public static void addition(int n1, int n2) {
        System.out.println("Addition of " + n1 + ", " + n2 + " = " + (n1 + n2));
    }

    public static void subtraction(int n1, int n2) {
        System.out.println("Subtraction of " + n1 + ", " + n2 + " = " + (n1 - n2));
    }

    public static void multiplication(int n1, int n2) {
        System.out.println("Multiplication of " + n1 + ", " + n2 + " = " + (n1 * n2));
    }

    public static void division(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("Cannot divide by Zero");
        } else {
            System.out.println("Division of " + n1 + ", " + n2 + " = " + (n1 / n2));
        }
    }
    
    //non static method
    
    public void doCalculation(int n1,int n2, char 
    		choice ) {
    	switch (choice) {
        case '+':
            addition(n1, n2);
            break;
        case '-':
            subtraction(n1, n2);
            break;
        case '*':
            multiplication(n1, n2);
            break;
        case '/':
            division(n1, n2);
            break;
        default:
            System.out.println("Invalid Choice");
    }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.println("Enter number 1: ");
        n1 = sc.nextInt();

        System.out.println("Enter number 2: ");
        n2 = sc.nextInt();

        System.out.println("Select\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");

        int choice = sc.nextInt();

        Calculator calculator = new Calculator();

    }
}