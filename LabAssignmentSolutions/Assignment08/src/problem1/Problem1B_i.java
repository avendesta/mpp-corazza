package problem1;

import java.util.function.Supplier;

public class Problem1B_i {
	public static void main(String[] args) {
		Supplier<Double> rand = () -> Math.random();
		System.out.println(rand.get());
	}
}
