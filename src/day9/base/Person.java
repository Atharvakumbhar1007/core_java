package day9.base;

public class Person {

		 // FIELDS
	    String name;
	    
	    int age;
	    
	    String gender;
	    
	    public Person(){
	    	System.out.println("Default constructor of Person Class");
	    	
	    }
	    
	    //Parameterized constructor
	    Person(String name, int age, String gender, boolean active){
	    	System.out.println("Parameter contructor od person class");
	    	this.name = name;
	    	this.age = age;
	    	this.gender = gender;
	    }
	    
	    //setters/getter
	    public void setName (String name) {
	    	this.name = name;
	    }
	    
	    public String getName () {
	    	return name;
	    }

	    public void setGender (String gender) {
	    	this.gender = gender;
	    }
	    
	    public String getGender() {
	    	return gender;
	    }
	    
	    public void setAge (int aage) {
	    	this.age = age;
	    }
	    
	    public int getAge() {
	    	return age;
	    }
	    
	    
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
		}
	    
}
	   
	    

