package problem04;

public class PrimeGenerator {
	public static void main(String[] args) {
//		final Stream<Integer> primes = Stream.iterate(2, PrimeStream::next);
		
		PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
		ps.printFirstNPrimes(10);
		System.out.println("====");
		ps.printFirstNPrimes(5);

	}

}

