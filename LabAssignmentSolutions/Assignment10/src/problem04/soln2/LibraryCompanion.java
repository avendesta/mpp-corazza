package problem04.soln2;

import java.util.function.Predicate;
import java.util.function.Function;

import problem04.Employee;
import problem04.Main;

public class LibraryCompanion {

	static Predicate<Employee> salaryGreaterThan100000 = (Employee e) -> (e.getSalary() > 100000);
	static boolean compSalaryGreaterThan100000(Employee e) {
		return salaryGreaterThan100000.test(e);
	}

	static Predicate<Employee> lastNameAfterM = (Employee e) -> (e.getLastName().charAt(0) > 'M');
	static boolean compLastNameAfterM(Employee e) {
		return lastNameAfterM.test(e);
	}

	
	static Function<Employee, String> fullName = e -> Main.fullName(e);
	static String getFullName(Employee e) {
		return fullName.apply(e);
	}
}
