package day27;

import java.util.regex.Pattern;

public class RegexEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//check whether the string contain only a or b or c?
		
		System.out.println("String contain any letter a,b,c? "
		+Pattern.matches("^[abc]$", "a"));
		
		System.out.println("String contain any letter a,b,c? "
				+Pattern.matches("^[abc]$", "aaa"));
		System.out.println("String contain any letter a,b,c? "
				+Pattern.matches("^[abc]$", "c"));
		System.out.println("String contain any letter a,b,c? "
				+Pattern.matches("^[abcABC]$", "A"));
	}

}
