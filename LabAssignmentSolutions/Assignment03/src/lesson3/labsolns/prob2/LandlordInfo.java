package lesson3.labsolns.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
	private List<Building> ownedBuildings;

	public LandlordInfo() {
		ownedBuildings = new ArrayList<Building>();
	}
	void addBuilding(Building b) {
		ownedBuildings.add(b);
	}
	double calcProfits() {
		double profit = 0.0;
		for(Building b: ownedBuildings) {
			for(Apartment a: b.getApartments()) {
				profit += a.getPrice();
			}
			profit -= b.getMaintenanceCost();
		}
		return profit;
	}
	public List<Building> getOwnedBuildings() {
		return ownedBuildings;
	}
}
