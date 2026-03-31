package day8;

public class Person {

		 // FIELDS
	    private String name;
	    
	    private int age;
	    
	    private String gender;
	    
	    private boolean active;
	    
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

	    //ALT + SHIFT + Y -> WORD WRAP
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", active=" + active + "]";
		}
	    
}
	   
	    

