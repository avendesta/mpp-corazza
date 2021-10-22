package lesson3.labsoluns.prob3B;

public class Main {

	public static void main(String[] args) {
		Cylinder cy = new Cylinder(3, 4.5);
		System.out.println(cy.getHeight());
		System.out.println(cy.computeVolume());
		

		Circle c1 = new Circle(3);
		System.out.println(c1.getHeight());
	}

}
