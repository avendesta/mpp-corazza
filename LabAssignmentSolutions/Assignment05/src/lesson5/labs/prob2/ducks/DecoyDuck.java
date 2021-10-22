package lesson5.labs.prob2.ducks;

import lesson5.labs.prob2.base.Duck;
import lesson5.labs.prob2.fly.CannotFly;
import lesson5.labs.prob2.quack.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		fb = new CannotFly();
		qb = new MuteQuack();
	}
}
