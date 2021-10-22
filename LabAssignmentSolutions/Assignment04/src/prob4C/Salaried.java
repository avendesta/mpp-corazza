package prob4C;

public class Salaried extends Employee {
	private static final double MONTHLY_PAY = 3000;
	@Override
	public double calcGrossPay(int month, int year) {
		return (month+12*year)*MONTHLY_PAY;
	}

}
