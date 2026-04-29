package day13.aggregation;

public class Address {

	private String societyName;
	
	private String pincode;
	
	private String City;
	
	private String country;
	
	public Address() {
		System.out.println("Default contructor od Address");
		
	}

	public Address(String societyName, String pincode, String city, String country) {
		super();
		this.societyName = societyName;
		this.pincode = pincode;
		City = city;
		this.country = country;
	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [societyName=" + societyName + ", pincode=" + pincode + ", City=" + City + ", country="
				+ country + "]";
	}
	
}
