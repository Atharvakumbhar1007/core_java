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
		System.out.println("String contain any letter a,b,c? "
				+Pattern.matches("^[a-zA-Z]$", "aAzZ"));
		System.out.println("String contain any letter a,b,c? "
				+Pattern.matches("^[0-9]$", "10"));
		
		//Many Numbers/or Many Charaters?
		
		System.out.println("String contain any letter a,b,c? "
				+Pattern.matches("^[0-9]$", "10"));
		System.out.println("String contain any letter a,b,c? "
				+Pattern.matches("^[0-9]$", "1007"));
		
		//n+	Matches any string that contains at least one n
		System.out.println("String contain any letter a,b,c? "
				+Pattern.matches("^[0-9]+$", "10"));
		System.out.println("String contain any letter a,b,c? "
				+Pattern.matches("^[0-9]+$", "107"));
		
		
	}

}
