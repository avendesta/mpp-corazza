package problem4.ducks;

import problem4.base.Duck;
import problem4.fly.CannotFly;
import problem4.quack.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		fb = new CannotFly();
		qb = new MuteQuack();
	}
}
