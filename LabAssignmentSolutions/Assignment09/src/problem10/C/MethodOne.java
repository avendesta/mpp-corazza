package problem10.C;

import java.util.stream.Stream;

public class MethodOne {

	public static void main(String[] args) {
		Stream<Integer> myIntStream = Stream.of(2,4,62,2,7,46,2,64,25,67,45,84,82,7);
		
		// extremes[0] will hold the minimum from the stream and
		// extremes[1] will hold the maximum from the stream myIntStream
		Integer[] extremes = new Integer[] {Integer.MAX_VALUE, Integer.MIN_VALUE};
		myIntStream.forEach(n -> {
			if(n<extremes[0]) extremes[0] = n;
			if(n>extremes[1]) extremes[1] = n;
		});
		System.out.println("Minimum: "+ extremes[0]);
		System.out.println("Maximum: "+ extremes[1]);
	}
}
