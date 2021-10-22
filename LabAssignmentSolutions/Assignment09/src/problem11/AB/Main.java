package problem11.AB;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import problem11.AB.Employee;
import problem11.AB.TriFunction;

public class Main {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		  
		  String output = emps.stream()
		  	.sorted(Comparator.comparing(Employee::fullName))
		  	.filter( e -> e.getSalary()>100000 )
		  	.filter( e -> e.getLastName().charAt(0)>'M')
		  	.map(Employee::fullName)
		  	.collect(Collectors.joining(", "));

		  System.out.println(output);
		  System.out.println("--------------- ----------------");
		  System.out.println(LambdaLibrary.GET_EMPLOYEES.apply(emps, 100000, 'M'));
	}
	
	
	

}
