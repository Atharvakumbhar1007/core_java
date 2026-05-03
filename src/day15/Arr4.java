package day15;

import java.util.Scanner;

public class Arr4 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		// Accept input in Arrays
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		//Accept input in arrays
		for(i = 0; i < arr.length; i++) {
			System.out.println("Enter elemnt at position "+i+": ");
			arr[i] = sc.nextInt();
		}
		
		//Display 
		System.out.println("Elents are: ");
		for(i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ "\t");
		}
	}
	
}
