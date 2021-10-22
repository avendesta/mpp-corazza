package lesson3.labsoluns.prob3B;

public class Circle {

	private Cylinder cylinder;
	public Circle(double radius) {
		cylinder = new Cylinder(radius, 0);
	}
	
	public double getRadius() {
		return cylinder.getRadius();
	}
	public double getHeight() {
		return cylinder.getHeight();
	}
	public double computeArea() {
		double r = cylinder.getRadius();
		double h = cylinder.getHeight();
		return Math.PI*r*r*h;
	}
}
