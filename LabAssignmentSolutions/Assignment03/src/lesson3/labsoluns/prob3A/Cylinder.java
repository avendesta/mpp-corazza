package lesson3.labsoluns.prob3A;

public class Cylinder {
	private double radius;
	private double height;

	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public double getRadius() {
		return radius;
	}

	public double computeVolume() { // V = h*πr^2
		return Math.PI * radius * radius * height;
	}
}
