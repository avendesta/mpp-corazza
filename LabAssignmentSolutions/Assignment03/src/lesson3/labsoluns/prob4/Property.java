package lesson3.labsoluns.prob4;

public abstract class Property {
	private double rent = computeRent();
	private Address address;
	private static final Address DEFAULT_ADDRESS = new Address("x","x","x",11);
	public Property(Address address) {
		this.address = address;
	}
	public Property() {
		this(DEFAULT_ADDRESS);
	}
	public double getRent() {
		return rent;
	}
	public Address getAddress() {
		return address;
	}
	public double computeRent() {
		return rent;
	}
	
}
