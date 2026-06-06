package day19;

import java.util.LinkedList;

public class CollectionList1 {

	public static void main(String[] args) {
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		
		numbers.add(-7);
		numbers.add(17);
		numbers.add(10);
		numbers.add(16);
		numbers.add(5);
		numbers.add(-72);
		numbers.add(50);
		numbers.push(9);
		
		System.out.println(numbers);
	}
}
