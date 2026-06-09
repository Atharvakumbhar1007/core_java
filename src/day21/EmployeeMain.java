package day21;

public class EmployeeMain {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Shruti","Female");
		
		Employee e2 = e1;
		
		Employee e3 = new Employee(1, "Shruti", "Female");
		
		//This will compare reference and not values
		System.out.println("Is e1 == e2? " +(e1 == e2)); //True
		
		System.out.println("Is e1 == e3? " +(e1 == e3)); //False
		
		//Check data of object and not reference -> equals
		System.out.println("Is e1 == e2 with equals()? " +e1.equals(e2)); //True
		
		System.out.println("Is e1 == e3 with equals()? " +e1.equals(e3)); //True
		
	}
}
 