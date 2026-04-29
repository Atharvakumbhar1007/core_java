package day13.aggregation;

public class AggregationMain {

	 public static void main(String[] args) {
		 
		 Customer customer = new Customer();
		 
		 customer.setAge(25);
		 customer.setCustomerName("Atharva Kumbhar");
		 customer.setPhone("+91 12345 12345");
		 
		 System.out.println(customer);
		 
		 Address address = new Address();
		 address.setCity("Navi Mumbai");
		 address.setSocietyName("Remo CHS");
		 address.setCountry("India");
		 address.setPincode("410 208");
		 
		 customer.setAddress(address);
		 
		 System.out.println(customer);
	 }
}
