package day17;


//@FunctionalInterface
public interface Calculator {

	// by default the interface has methods -> Abstract -> 
	// No body -> Only Name public
	/*No parameter*/
	void sum();
	
	  default void hello() {
	        System.out.println("Hello");
}
}
