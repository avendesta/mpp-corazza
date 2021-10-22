package lesson3.labsoluns.prob4.properties;

import lesson3.labsoluns.prob4.Address;
import lesson3.labsoluns.prob4.Property;

public class Trailer extends Property {
	private static final double DEFAULT_RENT = 500;
	private double rent = computeRent();
	private Address address;
	public Trailer(Address address) {
		super(address);
	}
	public Trailer() {
		super();
	}
	
	@Override
	public double computeRent() {
		return DEFAULT_RENT;
	}
	
}
