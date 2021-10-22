package prob4C;

public class Hourly extends Employee{
	private double hourlyWage;
	private int hoursPerWeek;

	@Override
	public double calcGrossPay(int month, int year) {
		double weeks = 4*(month+12*year);
		return hourlyWage*hoursPerWeek*weeks;
	}
}
