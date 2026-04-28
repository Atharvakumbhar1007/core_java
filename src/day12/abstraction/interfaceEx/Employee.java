package day12.abstraction.interfaceEx;

public class Employee implements Person{



	private int empId;
	
	private int age;
	
	private String name;
	
	private double salary;
	
	public Employee(int empId, int age, String name, double salary) {
		super();
		this.empId = empId;
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public void deductTax() {
		System.out.println("15% Tax Deducted i.e. "+0.15*salary);
		salary = salary - 0.15*salary;
	}

	 @Override
	 public void sayHello() {
		 System.out.println("Hello Hello From Employee");
		// TODO Auto-generated method stub
		
	 }

	 @Override
	 public void sayhello() {
		// TODO Auto-generated method stub
		
	 }

}
 