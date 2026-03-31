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
	    Person(String n, int a, String g, boolean act){
	    	System.out.println("Parameter contructor od person class");
	    	name = n;
	    	age = a;
	    	gender = g;
	    	active = act;
	    }
	    
	    //setters/getter
	    public void setName (String n) {
	    	name = n;
	    }
	    
	    public String getName () {
	    	return name;
	    }

	    public void setGender (String g) {
	    	gender = g;
	    }
	    
	    public String getGender() {
	    	return gender;
	    }
	    
	    public void setAge (int a) {
	    	age = a;
	    }
	    
	    public int getAge() {
	    	return age;
	    }
	    
	    public void setActive (boolean act) {
	    	active = act ;
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
	   
	    

