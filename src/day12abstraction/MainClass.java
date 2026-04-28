package day12abstraction;

public class MainClass {
	
	public static void main(String[] args) {
//		Person person = new Person("Shambhav Ghana",20,"Male");
		
		Employee employee = new Employee ("Pratik Mhatre", 30,"Male"
				,10001,25000);
//  		System.out.println(person);
		System.out.println(employee);
		employee.sayHello();
		employee.sayEmployee();
		
	}
}
