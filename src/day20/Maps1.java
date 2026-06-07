package day20;

import java.util.HashMap;
import java.util.Map;

public class Maps1 {
	
	public static void main(String[] args) {
		Map<String, String> contact = new HashMap<String, String>();
		
		contact.put("om", "+91 12345 12345");
		contact.put("ram", "+91 12345 12345");
		contact.put("omkar", "+91 12345 12345");
		
		System.out.println(contact);
		contact.put("Rohit", "+91 12345 12345");
		System.out.println(contact);
		
		System.out.println(contact.get("Shruti"));
		
		System.out.println( contact.getOrDefault("omkar", "Not Found"));
		System.out.println( contact.getOrDefault("om", "Not Found"));
		
		contact.replace("om", "+91 12345 12345", "121212121212");
		System.out.println(contact);
		
		contact.putIfAbsent("ram", "121212121211");
	 	contact.putIfAbsent("ram", "121212121211");
		System.out.println(contact);
		
		contact.keySet().forEach((key)-> System.out.println(key +" = "+ contact.get(key)));

contact.keySet().forEach((key)->System.out.println(key + " = "+ contact.get(key)));
		
		contact.values().forEach((value)->System.out.println(value));
		
		contact.remove("Abdul","1515888899");
		
		System.out.println(contact);
		contact.remove("Abdul");
		System.out.println(contact);
		
		contact.forEach((key, value)->System.out.println(key + " = "+value));
		
		
	}

}
 