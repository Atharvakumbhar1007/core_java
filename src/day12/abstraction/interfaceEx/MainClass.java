package day12.abstraction.interfaceEx;

public class MainClass {

	public static void main(String[] args) {

		
		Employee employee = new Employee(1001, 25,"Atharva Kumbhar",
				1000);
	
		employee.deductTax();
	
		System.out.println(employee);
		
		//Reference of base class object of derived class is called
		// as dyanamic method displaced
		
		Person person = new Employee (1002, 20 , "rohit shetty" , 2500);
		
		 person.sayHello();
		person.deductTax();
		System.out.println(person.toString());
}
}