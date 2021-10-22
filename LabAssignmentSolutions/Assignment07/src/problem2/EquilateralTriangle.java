package problem2;

public class EquilateralTriangle implements Polygon{
	double side;
	public EquilateralTriangle(int side) {
		this.side = side;
	}
	@Override
	public double[] getSides() {
		return new double[] { side, side, side};
	}

}
