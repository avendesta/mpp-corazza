package prob4C;

public final class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	
	public Paycheck(double fica, double state, double local, double medicare, double socialSecurity) {
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}
	public void print() {
		
	}
	public double getNetPay() {
		return 0.0;
	}
}
