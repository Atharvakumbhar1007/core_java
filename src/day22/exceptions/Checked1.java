package day22.exceptions;

import java.io.File;
import java.util.Scanner;

public class Checked1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("demo.txt");
		
		System.out.println(file);
		Scanner scanner = new Scanner(file); 
	}

}
