package lesson5.labs.prob1.rulesets;

public class Util {
	public static boolean isInRangeAtoZ(char c) {
		return (int)'A' <= (int)c && (int)c <= (int)'Z';
	}
	public static boolean isInRangeatoz(char c) {
		return (int)'a' <= (int)c && (int)c <= (int)'z';
	}
	public static boolean isInteger(String s) {
		return s.matches("\\d+");
	}
	// checks if string is double precision floating number
	public static boolean isFloat(String s) {
		long periodCount = s.chars().filter(ch -> ch == '.').count();
		if(periodCount != 1) return false;
		String[] pair = s.split("\\.");
		if(pair.length != 2) return false;
		if(pair[1].length() != 2) return false;
		if(!isInteger(pair[0])|| !isInteger(pair[1])) return false;
		return true;
	}
}
