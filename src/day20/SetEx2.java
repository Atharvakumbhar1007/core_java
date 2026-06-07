package day20;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx2 {
	
	public static void main(String[] args) {
		
		Set<String> favFruit = new TreeSet<String>();
		
		favFruit.add("BlueBerry");
		favFruit.add("Banana");
		favFruit.add("Mango");
		favFruit.add("Litchie");
		favFruit.add("Apple");
		favFruit.add("Orange");
		favFruit.add("Banana");
		favFruit.add("Orange");
		favFruit.add("Banana");
		favFruit.add("Water Mellon");
		
		System.out.println(favFruit);
		
		favFruit.contains("Banana");
		
		System.out.println(favFruit);
		
		favFruit.forEach((fruit)->System.out.println(fruit));//Lamda Expression
		
		System.out.println("Before removing all fruits with letter 'a'");
		System.out.println(favFruit);
		
		favFruit.removeIf((fruit)->fruit.toLowerCase().contains("a"));
		
		System.out.println("After removing all fruits with letter 'a'");
		System.out.println(favFruit);
	}

}
 