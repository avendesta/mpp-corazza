package problem5;

import java.util.Arrays;
import java.util.List;

public class ForEachExample2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		list.stream()
		.map(String::toUpperCase)
		.forEach(System.out::print);		
	}

}