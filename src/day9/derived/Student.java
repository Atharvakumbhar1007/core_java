package day9.derived;

public class Student {

	//name, age, gender, rollno, percentage
	
	private int age;
	
	private String gender;
	
	private String name;
	
	private int rollNo;
	
	private double percentage;
	
	 public Student() {
		 //TOOD Auto-generated constructor stub
	 }
	 
	 public Student(int age, String gender, String name, int rollNo, double percentage) {
		 super();
		 this.age = age;
		 this.gender = gender;
		 this.name = name;
		 this.rollNo = rollNo;
		 this.percentage = percentage;
	
	 }

	 public int getAge() {
		return age;
	}

	 public void setAge(int age) {
		 this.age = age;
	 }

	 public String getGender() {
		 return gender;
	 }

	 public void setGender(String gender) {
		 this.gender = gender;
	 }

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
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
		return "Student [age=" + age + ", gender=" + gender + ", name=" + name + ", rollNo=" + rollNo + ", percentage="
				+ percentage + "]";
	}
}
/*
 * Alter table tblname
 * rename old_col to new_col*/
