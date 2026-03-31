package day8;

public class Person {

		 // FIELDS
	    private String name;
	    
	    private int age;
	    
	    private String gender;
	    
	    private  boolean active;
	    
	    //Constructor -> Method
	    //Default Constructor -> No parameters
	    Person(){
	    	System.out.println("Default constructor of Person Class");
	    	
	    	name = "SPRK";
	    	age = 35;
	    	gender = "Female";
	    	active = true;
	    }
	    
	    //Parameterized constructor
	    Person(String name, int age, String gender, boolean active){
	    	System.out.println("Parameter contructor od person class");
	    	this.name = name;
	    	this.age = age;
	    	this.gender = gender;
	    	this.active = active;
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
	    
	    public void setActive (boolean active) {
	    	this.active = active ;
	    }
	    
	    public boolean getActive() {
	    	return active;
	    }
	    
	    
	    //ALT + SHIFT + Y -> WORD WRAP
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", active=" + active + "]";
		}
	    
}
	   
	    

