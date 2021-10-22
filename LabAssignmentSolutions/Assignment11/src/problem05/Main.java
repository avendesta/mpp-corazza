package problem05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
//	public static <T extends Comparable<T>> T secondSmallest(List<T> list) {
//		if(list == null) return null;
//		if(list.size()<2) return null;
//		T small = list.get(0);
//		T secondSmall = list.get(1);
//		for(T t: list) {
//			if(t.compareTo(small)==0)
//				continue;
//			if(t.compareTo(small)<0) {
//				secondSmall = small;
//				small = t;
//				continue;
//			}
//			if(t.compareTo(secondSmall)<0)
//				secondSmall = t;
//		}
//		return secondSmall;
//	}
	
	public static <T> T secondSmallest(List<T> list, Comparator<T> cmp) {
		if(list == null) return null;
		if(list.size()<2) return null;
		T small = list.get(0);
		T secondSmall = list.get(1);
		for(T t: list) {
			if(cmp.compare(t,small)==0)
				continue;
			if(cmp.compare(t,small)<0) {
				secondSmall = small;
				small = t;
				continue;
			}
			if(cmp.compare(t,secondSmall)<0)
				secondSmall = t;
		}
		return secondSmall;
	}
	
	public static void main(String[] args) {
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(-Integer.MAX_VALUE);
		listInteger.add(Integer.MAX_VALUE-1);
		listInteger.add(Integer.MAX_VALUE-2);
		listInteger.add(9);
		System.out.println(secondSmallest(listInteger, Integer::compareTo));
		
		List<String> listString = new ArrayList<>();
		listString.add("A");
//		listString.add("B");
		listString.add("a");
		listString.add("c");
//		listString.add("1");
		System.out.println(secondSmallest(listString, String::compareTo));
	}

}
