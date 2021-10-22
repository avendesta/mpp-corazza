package problem1;

import java.util.function.Supplier;

public class Problem1B_ii {
	public static void main(String[] args) {
		Problem1B_ii x = new Problem1B_ii();
		Randomer rand = x.new Randomer();
		System.out.println(rand.get());
	}
	
	class Randomer implements Supplier<Double>{

		@Override
		public Double get() {
			return Math.random();
		}
		
	}
}
