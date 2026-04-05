package day10;

public class Dog extends Animal{
	
	public Dog(){
		System.out.println(getClass().getName()+ "object created");
	}
	
	public void bark() {
		System.out.println("Dog is barking");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I am dog and I am eating");
	}
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("I am dog and I running");
	}
	
	/*
	 * 
	 * METHOD OVERRIDING:
	 * Two or more method with the same name one in 
	 * base class and one in derived class
	 * is called as Method Overriding*/
	
}
