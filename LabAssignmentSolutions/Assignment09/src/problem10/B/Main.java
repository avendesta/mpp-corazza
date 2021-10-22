package problem10.B;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<String> namez = Stream.of("Bill", "Thomas", "Mary");
		System.out.println(namez.collect(Collectors.joining(", ")));
	}

}
