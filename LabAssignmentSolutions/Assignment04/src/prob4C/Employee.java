package prob4C;

public abstract class Employee {
	private int empId;
	public void print() {
		
	}
	public Paycheck calcCompensation(int month, int year) {
		double grossPay = calcGrossPay(month, year);
		
		double fica = 0.23*grossPay;
		double state = 0.05*grossPay;
		double local = 0.01*grossPay;
		double medicare = 0.03*grossPay;
		double socialSecurity = 0.075*grossPay;
		
		return new Paycheck(fica, state, local, medicare, socialSecurity);
	};
	
	public abstract double calcGrossPay(int month, int year);
	
}
