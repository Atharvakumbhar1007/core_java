package day20;

import java.net.SocketTimeoutException;
import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
	
	public static void main(String[] args) {
		Set<String> favFruit = new HashSet<String>();
		
		favFruit.add("Banana");
		favFruit.add("Mango");
		favFruit.add("Litchie");
		favFruit.add("Apple");
		favFruit.add("Orange");
		favFruit.add("Banana");
		favFruit.add("Orange");
		favFruit.add("Banana");
		
		System.out.println(favFruit);
	}

}
