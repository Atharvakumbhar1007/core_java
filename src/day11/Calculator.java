package day11;

public class Calculator {
	
	//Methods
	public void addition(int n1, int n2) {
		System.out.println("Addition of "+n1+", "+n2+" = "+(n1+n2));
	}
	public void multiplication(int n1, int n2) {
		System.out.println("Multiplication of "+n1+", "+n2+" = "+(n1*n2));
	}
	public void division(int n1, int n2) {
		if(n2==0) {
			System.out.println("Cannot divide by Zero");
		}else {
		System.out.println("division of "+n1+", "+n2+" = "+(n1/n2));
		}
		
	 }
}
	

