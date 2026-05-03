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
 		
	}
}
