package day18;

public class MainClass {

	public static void main (String[] args) {
//		
//		Calculator calculator = (int n1, int n2)->{
//			return n1 + n2;
//		};

		Calculator calculator = (n1,n2)-> n1+n2;
		
		System.out.println(calculator.sum(70,40));
	}
}
