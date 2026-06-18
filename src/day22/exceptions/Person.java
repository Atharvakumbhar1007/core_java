package day22.exceptions;

public class Person {

	private int age;
	
	void acceptAge (int age) throws AgeIncorrect {
		if(age < 0 || age > 150) {
			throw new AgeIncorrect("Age cannot br negative or greater than 150 years ");
			
		}
		this.age = age;
	}
}
