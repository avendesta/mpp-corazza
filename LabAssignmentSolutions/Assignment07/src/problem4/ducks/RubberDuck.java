package problem4.ducks;

import problem4.base.Duck;
import problem4.fly.CannotFly;
import problem4.quack.Squeak;

public class RubberDuck extends Duck {
	public RubberDuck() {
		fb = new CannotFly();
		qb = new Squeak();
	}
}
