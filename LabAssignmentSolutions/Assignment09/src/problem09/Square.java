package problem09;

// assuming all the integers are positive integers
public class Square {
	final int first = 1;
	
	static int next(int square) {
		int lessRoot = (int) Math.sqrt(square);
		lessRoot++;
		return lessRoot*lessRoot;
	}
}
