package problem2;

public interface Polygon extends ClosedCurve {
	double[] getSides();

	default double computePerimeter() {
		double perimeter = 0.0;
		for(double s: getSides())
			perimeter += s;
		return perimeter;
	}

}
