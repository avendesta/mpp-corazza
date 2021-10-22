package problem10.A;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
		System.out.println(someSimpleIsTrue(list));
	}
	
	static boolean someSimpleIsTrue(List<Simple> list) {
		return list.stream().reduce(new Simple(false), (a, b) -> new Simple(a.flag || b.flag)).flag;
	}

}
