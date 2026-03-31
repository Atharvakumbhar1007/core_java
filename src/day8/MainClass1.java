package day8;

//Constructor
public class MainClass1 {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		
		System.out.println(p1);
		
		Person p2 = new Person("atharva",22,"male",false);
		
		System.out.println(p2);
		
		//Object is created with default constructor
		//now I want to modify default values
		//Change private ->setters
		//Access private ->getters
	}
}
