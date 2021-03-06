package problem3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");

		// print each element of the list in upper case format
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s.toUpperCase());
			}
		};

		list.forEach(consumer);
		// l.forEach(x -> System.out.println(x));
	}

	// implement a Consumer

}