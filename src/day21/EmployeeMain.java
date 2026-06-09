package day21;

public class EmployeeMain {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Shruti","Female");
		
		Employee e2 = e1;
		
		Employee e3 = new Employee(1, "Shruti", "Female");
		
		System.out.println("Is e1 == e2? " +(e1 == e2)); // true
		
		System.out.println("Is e1 == e3? " +(e1 == e3));
	}
}
 