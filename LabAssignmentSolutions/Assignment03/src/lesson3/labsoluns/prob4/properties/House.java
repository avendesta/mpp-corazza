package lesson3.labsoluns.prob4.properties;

import lesson3.labsoluns.prob4.Address;
import lesson3.labsoluns.prob4.Property;

public class House extends Property {
	private static final double RENT_PER_LOTSIZE = 0.1;
	private double rent;
	private Address address;
	private int lotSize;
	public House(Address address, int lotSize) {
		super(address);
		this.lotSize = lotSize;
		rent = computeRent();
	}
	public House(int lotSize) {
		super();
		this.lotSize = lotSize;
	}
	
	@Override
	public double getRent() {
		return lotSize*RENT_PER_LOTSIZE;
	}
}
