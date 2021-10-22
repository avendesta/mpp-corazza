package problem10.C;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodTwo {

	public static void main(String[] args) {
		Stream<Integer> myIntStream = Stream.of(2,4,62,2,7,46,2,64,25,67,45,84,82,7);
		IntSummaryStatistics summary = myIntStream.collect(Collectors.summarizingInt(Integer::intValue));

		Integer maximum = summary.getMax();
		Integer minimum = summary.getMin();
		System.out.printf("Maximum: %d\nMinimum: %d\n", maximum, minimum);
	}
}
