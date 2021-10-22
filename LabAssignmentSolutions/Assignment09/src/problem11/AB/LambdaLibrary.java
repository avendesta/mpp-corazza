package problem11.AB;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	public static final 
		TriFunction<List<Employee>, Integer, Character, String> GET_EMPLOYEES 
			= (list, minSalary, minLastFirstChar) -> list.stream()
			  	.sorted(Comparator.comparing(Employee::fullName))
			  	.filter( e -> e.getSalary()>minSalary )
			  	.filter( e -> e.getLastName().charAt(0) > minLastFirstChar)
			  	.map(Employee::fullName)
			  	.collect(Collectors.joining(", "));
}
