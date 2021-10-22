package problem4.behaviour;

public interface Quackable {
	public default void quack() {
		System.out.println("\tquacking");
	}
}
