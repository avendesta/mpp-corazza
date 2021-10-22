package problem3;

import java.util.List;
import java.util.function.BiFunction;
import java.util.ArrayList;

public class BiFunctionProblem {
	 BiFunction<Double, Double, List<Double>> addToList = (x, y) -> {
		 List<Double> list = new ArrayList<>();
		 list.add(Math.pow(x,y));
		 list.add(x * y);
		 return list;
	 };
	 public static void main(String[] args) {
		List<Double> list = new ArrayList<Double>();
		list = new BiFunctionProblem().addToList.apply(2.0, 3.0);
		System.out.println(list);
	}
}
