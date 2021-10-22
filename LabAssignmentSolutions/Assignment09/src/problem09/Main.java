package problem09;

import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		printSquares(5);
		System.out.println("----===xx===----");
		printSquares(3);
	}
	
	public static void printSquares(int num) {
		IntStream.iterate(1, Square::next).limit(num).forEach(System.out::println);
	}
}
