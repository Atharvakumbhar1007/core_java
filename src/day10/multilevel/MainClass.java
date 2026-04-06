package day10.multilevel;

public class MainClass {

	public static void main(String[] args) {
		PartTimeEmployee pt1 = new PartTimeEmployee
				("Atharva kumbhar",30,"make",1001,1500,10);
		
		pt1.calculateTax();
		System.out.println(pt1);

	}

}
 