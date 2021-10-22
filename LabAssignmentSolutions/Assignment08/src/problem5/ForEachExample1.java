package problem5;

import java.util.Arrays;
import java.util.List;

public class ForEachExample1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		list.forEach(w -> System.out.println(w.toUpperCase()));
	}

}