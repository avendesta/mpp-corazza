package lesson5.labs.prob2.ducks;

import lesson5.labs.prob2.base.Duck;
import lesson5.labs.prob2.fly.CannotFly;
import lesson5.labs.prob2.quack.Squeak;

public class RubberDuck extends Duck {
	public RubberDuck() {
		fb = new CannotFly();
		qb = new Squeak();
	}
}
