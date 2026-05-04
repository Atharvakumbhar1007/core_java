package day17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class ListEx1 {
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(15);
		list.add(10);
		list.add(19);
		list.add(7);
		list.add(5);
		list.add(10);
		list.add(12);
		list.add(1);
		list.add(17);
		System.out.println("List before Sorting in ascending order: ");
		System.out.println(list);
		
		System.out.println("List after Sorting in ascending order: ");
		//Sorting Algo is TIMESORT
		list.sort(null);
		System.out.println(list);
		
		System.out.println("List after Sorting in decending order: ");
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("Shriti");
		name.add("Sakshio");
		name.add("Om");
		name.add("Aditya");
		name.add("Dharamraj");
		name.add("Ayush");
		name.add("Rajesh");
		
		System.out.println("Names before sorting: ");
		System.out.println(name);
		
		name.sort(null);
		System.out.println("Names afetr sorting in ASC: ");
		System.out.println(name);
		
		name.sort(Comparator.reverseOrder()); 
		System.out.println("Names afetr sorting in DSC: ");
		System.out.println(name);
	}
}
