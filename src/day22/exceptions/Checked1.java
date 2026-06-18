package day22.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Checked1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("demo.txt");
		
		System.out.println(file);
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			System.out.println("File Opened Successfully");
		} catch (FileNotFoundException e) {
			 // TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			//Irrespective of try/catch execution,
			//Finally will always execute
			
			System.out.println("Finally executed");
			if(sc != null) {
				sc.close();
				System.out.println("File closed Successfully");
			}
		}
	}

}
