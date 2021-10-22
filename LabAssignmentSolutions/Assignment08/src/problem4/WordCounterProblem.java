package problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WordCounterProblem {
	
	public static void main(String[] args) {
		List<String> goodWords = new ArrayList<String>();
		goodWords.add("GoodJob");
		goodWords.add("JavaMan");
		goodWords.add("English");
		goodWords.add("Bader");
		goodWords.add("Western");
		goodWords.add("abcdefg");
		
		System.out.println(countWisely(goodWords, 'a', 'J', 7));
	}
	
	public static int countWisely(List<String> words, char c, char d, int len) {
		List<String> goodWords = 
		words.stream()   //convert list to stream
		.filter(word -> word.length()==len) // filter by length
		.filter(word -> word.indexOf(c)>=0)	// filter those who contain c
		.filter(word -> word.indexOf(d)<0)	// filter those that don't include d
		.collect(Collectors.toList()); 	//organizes into a list		
		return goodWords.size();
	}
	
}
