package day19;

import java.util.ArrayList;
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
		
		numbers.offer(66);
		System.out.println(numbers);
		
		numbers.add(3, 1000);
		System.out.println(numbers);
		System.out.println("Gives which element will be deleted from head not delete ="+numbers.pop());
		System.out.println(numbers);
		System.out.println("Deleted element from head ="+numbers.pop());
		System.out.println(numbers);
		System.out.println("Deleted element from head ="+numbers.pop());
		
		
	}
}
