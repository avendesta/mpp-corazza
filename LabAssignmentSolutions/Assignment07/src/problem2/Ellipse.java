package problem2;

public class Ellipse implements ClosedCurve {

	double a; // semiMajorAxis;
	double E; // the elliptic integral
	public Ellipse(double a, double E) {
		this.a = a;
		this.E = E;
	}
	@Override
	public double computePerimeter() {
		return 4*a*E;
	}
	
}
