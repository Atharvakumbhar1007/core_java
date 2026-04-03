package day9.base;

public class Person {

		 // FIELDS
	    protected String name;
	    
	    protected int age;
	    
	    protected String gender;
	    
	    public Person(){
	    	System.out.println("Default constructor of Person Class");
	    	
	    }
	    
	    //Parameterized constructor
	    public Person(String name, int age, String gender){
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
	   
	    

