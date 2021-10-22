package problem04;

import java.util.stream.Stream;

public class PrimeStream {
   // Used for a stateful PrimeNumber
   private Integer lastPrime = 0;

   // Computes the prime number after the last generated prime
   public Integer next() {
      lastPrime = next(lastPrime);
      return lastPrime;
   }

   // Computes the prime number after the specified number
   public static Integer next(Integer after) {
      Integer counter = after;
      // Keep looping until you find the next prime number
      while (!isPrime(++counter));
      return counter;
   }

   // Checks if the specified number is a prime number
   public static boolean isPrime(Integer number) {
      // <= 1 is not a prime number
      if (number <= 1) {
         return false;
      }

      // 2 is a prime number
      if (number == 2) {
         return true;
      }

      // Even numbers > 2 are not prime numbers
      if (number % 2 == 0) {
         return false;
      }
      long maxDivisor = (long) Math.sqrt(number);
      for (int counter = 3; counter <= maxDivisor; counter += 2) {
         if (number % counter == 0) {
            return false;
         }
      }

      return true;
   }
   public void printFirstNPrimes(Integer n) {
		Stream.iterate(2, PrimeStream::next).limit(n).forEach(System.out::println);
   }
}