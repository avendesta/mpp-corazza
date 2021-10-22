package lesson3.labsoluns.prob3A;

public class Main {

	public static void main(String[] args) {
		Cylinder c1 = new Circle(3);
		System.out.println(c1.getHeight());
		System.out.println(c1.computeVolume());
		
		Circle cc1 = (Circle) c1;
		System.out.println(cc1.getRadius());
		System.out.println(cc1.computeArea());

	}

}
