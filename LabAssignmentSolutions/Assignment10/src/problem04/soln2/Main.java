package problem04.soln2;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import problem04.Employee;

public class Main {

	public static void main(String[] args) {
		Stream<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000)).stream();
		
//		  System.out.println(emps
//				    .filter(e -> (e.getSalary() > 100000))
//				    .filter(e -> (e.getLastName().charAt(0) > 'M'))
//				    .map(e -> fullName(e))
//				    .sorted()
//				    .collect(Collectors.joining(", ")));
				               
		new Main().printEmps(emps);

	}
	
	public String asString(Stream<Employee> emps) {
		return (emps
				.filter(LibraryCompanion.salaryGreaterThan100000)
			    .filter(LibraryCompanion.lastNameAfterM)
			    .map(LibraryCompanion.fullName)
			    .sorted()
			    .collect(Collectors.joining(", ")));
	}
		
	public void printEmps(Stream<Employee> emps) {
		System.out.println(asString(emps));
	}
	
//	private static String fullName(Employee e) {
//		return e.getFirstName() + " " + e.getLastName();
//	}
	public static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}

}
