package day15;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		
		System.out.println(numbers);
		
		numbers.add(10);
		
		System.out.println(numbers);
		
		numbers.add(100);
		
		numbers.add(17);
		
		numbers.add(99);
		
		numbers.add(-10);
		
		System.out.println(numbers);
		
		numbers.add(1,-250);
		System.out.println(numbers);
		
		ArrayList<Integer> newCollection = new ArrayList<Integer>();
		
 		newCollection.add(-550);
 		newCollection.add(2550);
 		newCollection.add(9550);
 		
 		numbers.addAll(newCollection);
 		
 		System.out.println(numbers);
 		numbers.addAll(1, newCollection);
 		System.out.println(numbers);
 		
 		System.out.println("Length of Arraylist = "+numbers.size());
 		
 		System.out.println("Accessing Elemnts");
 		System.out.println("Element at index 3 ="+numbers.get(3));

 		System.out.println("First Element ="+numbers.getFirst());
 		System.out.println("Last Element ="+numbers.getLast());
 		
 		System.out.println("Element delected at index 2  ="+numbers.remove(2));
 		System.out.println(numbers);
	}
}
