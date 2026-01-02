package day3;

import java.util.Scanner;

//WAP to check whether the number is 
//divisible by 3 and 5 both or not

public class If2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		
		int remainderBy3 = number % 3;
		int remainderBy5 = number % 5;
		
		if(remainderBy3 == 0 && remainderBy5 == 0) {
			System.out.println("Number: "+number+" is diviible by 3 & 5 both");
		}else {
			System.out.println("Number: "+number+" is not diviible by 3 & 5 both");
		}
	}

}
