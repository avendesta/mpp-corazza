package lesson3.labsoluns.prob4;

public class Address {
	private String street;
	private String city;
	private String state;
	private int zip;
	public Address(String street, String city, String state, int zip){
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	
}
