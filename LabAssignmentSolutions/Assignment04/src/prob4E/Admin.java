package prob4E;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double totalEmployeeBalance = 0.0;
		for(Employee emp: list)
			totalEmployeeBalance += emp.computeUpdatedBalanceSum();
		return totalEmployeeBalance;
	}
}
