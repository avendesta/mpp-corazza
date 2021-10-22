package lesson3.labsoluns.prob4;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property p : properties) {
				totalRent += p.computeRent();
		}
		return totalRent;
	}
}
