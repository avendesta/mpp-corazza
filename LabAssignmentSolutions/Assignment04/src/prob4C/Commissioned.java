package prob4C;

import java.util.List;

public class Commissioned extends Employee {
	private static final double PERCENTAGE = 0.23;
	private double commission;
	private double baseSalary;
	private List<Order> orderList;

	@Override
	public double calcGrossPay(int month, int year) {
		int orderCount = 0;
		for(Order o: orderList)
			orderCount += o.getOrderAmount();
		commission = orderCount*PERCENTAGE;
		return commission+baseSalary*(month+12*year);
	}
}
