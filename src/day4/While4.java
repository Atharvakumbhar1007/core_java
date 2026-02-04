package day4;

import java.util.Scanner;

//WAP to print table of 5 till 10 iteration
public class While4 {

	public static void main(String[] args) {
		int num = 5;
		int i = 1;
	
		while(i <= 10) {
			System.out.println(num + "x" + i + "=" + (num * i));
			i++;
		}
		
	}
}
