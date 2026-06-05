package day18.model;

public class Student implements Comparable<Student> {

	private int rollNo;
	
	private String name;
	
	private String deparment;
	
	private double percentage;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollNo, String name, String deparment, double percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.deparment = deparment;
		this.percentage = percentage;
	}

	@Override
	public int compareTo(Student obj) {
		// TODO Auto-generated method stub
		
		return Integer.compare(rollNo, obj.rollNo);

	}
}
