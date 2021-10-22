package lesson3.labsoluns.prob3A;

public class Circle extends Cylinder {
//	private double radius;
	public Circle(double radius) {
		super(radius, 0);
//		this.radius = radius;
	}
	public double getRadius() {
		return super.getRadius();
	}
	
	public double computeArea() {
		return Math.PI*getRadius()*getRadius();
	}
}
