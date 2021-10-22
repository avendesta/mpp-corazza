package prob4E;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accounts;
	public Employee(String name) {
		this.name = name;
		accounts = new ArrayList<Account>();
	}
	
	public void addAccount(Account acc) {
		accounts.add(acc);
	}
	
	public double computeUpdatedBalanceSum() {
		double totalAccountBalance = 0;
		for(Account acc: accounts)
			totalAccountBalance += acc.computeUpdatedBalance();
		return totalAccountBalance;
	}

	public String getName() {
		return name;
	}
}
