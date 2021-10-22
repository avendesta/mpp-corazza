package lesson3.labsolns.prob2;

import java.util.List;

public class Building {

	private double maintenanceCost;
	private List<Apartment> apartments;
	
	public Building(double maintenanceCost, List<Apartment> apartments) {
		this.maintenanceCost = maintenanceCost;
		this.apartments = apartments;
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public List<Apartment> getApartments() {
		return apartments;
	}
}
