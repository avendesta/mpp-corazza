package lesson3.labsoluns.prob4.properties;

import lesson3.labsoluns.prob4.Address;
import lesson3.labsoluns.prob4.Property;

public class Condo extends Property {
	private double rent = computeRent();
	private int numFloors;
	private Address address;
	public Condo(Address address, int numFloors) {
		super(address);
		this.numFloors = numFloors;
	}
	public Condo(int numFloors) {
		super();
		this.numFloors = numFloors;
	}
	
	public int getNumFloors() {
		return numFloors;
	}
	@Override
	public double computeRent() {
		return 400*numFloors;
	}
}
