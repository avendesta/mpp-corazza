package prob4E;

public class SavingsAccount extends Account {
	private double balance;
	private double interestRate;
	private String accId;

	public SavingsAccount(String accId, double interestRate, double startBalance) {
		this.accId = accId;
		this.interestRate = interestRate;
		balance = startBalance;
	}
	@Override
	public String getAccountID() {
		return accId;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double computeUpdatedBalance() {
		return balance*(1+interestRate);
	}
	
}
