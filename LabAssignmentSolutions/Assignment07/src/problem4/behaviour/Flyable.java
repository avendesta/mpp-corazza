package problem4.behaviour;

public interface Flyable {
	public default void fly() {
		System.out.println("\tfly with wings");
	}
}
