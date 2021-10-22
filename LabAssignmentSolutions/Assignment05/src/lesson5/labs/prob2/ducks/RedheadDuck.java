package lesson5.labs.prob2.ducks;

import lesson5.labs.prob2.base.Duck;
import lesson5.labs.prob2.fly.FlyWithWings;
import lesson5.labs.prob2.quack.Quack;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		fb = new FlyWithWings();
		qb = new Quack();
	}
}
