package day9.derived;

import day9.base.Person;

public class Student extends Person {

	//name, age, gender, rollno, percentage
	
	private int rollNo;
	
	private double percentage;
	
	 public Student() {
		 super();
		 System.out.println("Default contructor of Student Class");
	 }
	 
	 //parameterized constructor
	 public Student(int age, String gender, String name, int rollNo, double percentage) {
		 super(name,age,gender); //default constructor call of base class
		 System.out.println("Parameterized contructor of Student Class");
		 this.rollNo = rollNo;
		 this.percentage = percentage;
	
	 }

	 public int getRollNo() {
		 return rollNo;
	 }

	 public void setRollNo(int rollNo) {
		 this.rollNo = rollNo;
	 }

	 public double getPercentage() {
		 return percentage;
	 }

	 public void setPercentage(double percentage) {
		 this.percentage = percentage;
	 }
	 

	 @Override
	public String toString() {
		return super.toString()+"Student [ rollNo=" + rollNo + ", percentage="
				+ percentage + "]";
	}
}
/*
 * Alter table tblname
 * rename old_col to new_col*/
