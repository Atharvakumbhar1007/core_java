package day10.multilevel;

public class Employee extends Person {
	
	protected int empId;
	
	protected double employeeSalary;
	
	public Employee() {
		System.out.println("Default cosntructor of Employee");
	}

	public Employee(String name, int age, String gender, int empId, double employeeSalary) {
		super(name, age, gender);
		this.empId = empId;
		this.employeeSalary = employeeSalary;
	}

	
	                                                
}
