package day22.exceptions;

import java.io.FileNotFoundException;

public class Person {

	private int age;
	
	void acceptAge (int age) throws AgeIncorrect , FileNotFoundException {
		if(age < 0 || age > 150) {
			throw new AgeIncorrect("Age cannot br negative or greater than 150 years ");
			
		}
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}
	
}
