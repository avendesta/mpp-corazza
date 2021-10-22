package prob4E;

public class CheckingAccount extends Account{
	private double balance;
	private double monthlyFee;
	private String accId;
	
	public CheckingAccount(String accId, double fee, double startBalance) {
		this.accId = accId;
		monthlyFee = fee;
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
		return balance-monthlyFee;
	}
	
}
