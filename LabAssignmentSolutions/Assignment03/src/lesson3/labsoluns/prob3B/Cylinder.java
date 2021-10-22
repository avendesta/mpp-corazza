package lesson3.labsoluns.prob3B;

public class Cylinder {
	private double height;
	private double radius;
	public Cylinder(double radius, double height){
		this.radius = radius;
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double computeVolume() {
		return Math.PI*radius*radius*height;
	}
}
