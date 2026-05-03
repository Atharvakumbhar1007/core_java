package day16;

import java.util.ArrayList;

//Store fruits name (String) in a List

public class ArrayListEx2 {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Watermelon");
		fruits.add("Papaya");
		fruits.add("Stawberry");
		
		System.out.println(fruits);
		fruits.add(1,"Mango");
		System.out.println(fruits);
		fruits.add("Banana");
		System.out.println(fruits);
		
		System.out.println(fruits.get(3));
		
		System.out.println("Element Banana at Index Number = "+fruits.indexOf("Banana"));
		
		System.out.println("Last Element Banana at Index Number = "+fruits.lastIndexOf("Banana"));
		
		System.out.println("My Fruits Contains Guava or not? = "+fruits.contains("Guava"));
		
		System.out.println("My Fruits Contains Apple or not? = "+fruits.contains("Apple"));
		
		System.out.println(fruits);
		
		System.out.println(fruits.remove("Apple"));
		
		System.out.println(fruits);
		
		//Loops to print element
		
		System.out.println("All fruits using normal for loops are: ");
		for(int i = 0; i < fruits.size(); i++) {
			System.out.println("I like  "+fruits.get(i));
		}
		System.out.println("All fruits using enhance for loops are:");
		
		//Enhance for loop
		System.out.println("All fruits using enhanced for loop are: ");
		for(String fruit : fruits) {
			
			System.out.println("I have "+fruit+"in refrigerator");
		}
		
	}
}
