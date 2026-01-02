package day3;

import java.util.Scanner;

//WAP to check whether the character is a number is a number or upper
//case or lower or special character
public class Task3 {
	
public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character: "); 
		char ch =sc.next().charAt(0);
		
		if (ch >= '0' && ch <= '9') {
            System.out.println("It is a Number");
        }
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("It is an Uppercase Letter");
        }
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("It is a Lowercase Letter");
        }
        else {
            System.out.println("It is a Special Character");
        }
	}
}
