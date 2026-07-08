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
		
		System.out.println("String contain any number but 7 time 0-9?"
				+Pattern.matches("^[0-9]{7}$", "107"));
		System.out.println("String contain any number but 7 time 0-9?"
				+Pattern.matches("^[0-9]{7}$", "10711"));
		System.out.println("String contain any number but 7 time 0-9?"
				+Pattern.matches("^[0-9]{3}$", "107"));
		System.out.println("String contain any number but min 2 max 5?"
				+Pattern.matches("^[+]{1}[0-9]{2,5}$", "+91"));
		
		System.out.println("Password min 8 max many:  "+Pattern.matches("^[a-zA-Z0-9@%&]{8,}$", "abcd"));
		System.out.println("Password min 8 max many:  "+Pattern.matches("^[a-zA-Z0-9@%&]{8,}$", "123ABCD125"));
		
		// meta characters
		
		System.out.println("Hello \"SPRK\"");
		
		
		System.out.println("Only Numbers: "+Pattern.matches("^\\d$", "5"));
		System.out.println("Only Numbers: "+Pattern.matches("^\\d+$", "50001"));
		System.out.println("Numbers: "+Pattern.matches("^\\d+$", "5OO"));
		
		System.out.println("Non Numbers: "+Pattern.matches("^\\D+$", "50001"));
		
		//^[^0-9]+$
		System.out.println("Non Numbers: "+Pattern.matches("^\\D+$", "Hello"));
		
		
		// A-Za-z0-9
		System.out.println("Characters and Numbers: "+Pattern.matches("^\\w+$", "Hello123"));
		
		System.out.println("Only Space: "+Pattern.matches("^\\s+$", "      "));
		System.out.println("Only Space: "+Pattern.matches("^\\s+$", "  H     "));
		System.out.println("Non Space: "+Pattern.matches("^\\S+$", "Hello World"));
		System.out.println("Non Space: "+Pattern.matches("^\\S+$", "HelloWorld"));
		
		
		
	}

}
