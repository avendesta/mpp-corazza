package lesson3.labsoluns.prob4;

import lesson3.labsoluns.prob4.properties.Condo;
import lesson3.labsoluns.prob4.properties.House;
import lesson3.labsoluns.prob4.properties.Trailer;

public class Driver {

	public static void main(String[] args) {

		Property[] properties = { new House(9000), new Condo(2), new Trailer() };
		double totalRent = Admin.computeTotalRent(properties);
		System.out.println(totalRent);
	}
}
