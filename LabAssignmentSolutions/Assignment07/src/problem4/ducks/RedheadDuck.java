package problem4.ducks;

import problem4.base.Duck;
import problem4.fly.FlyWithWings;
import problem4.quack.Quack;

public class RedheadDuck extends Duck{
	public RedheadDuck() {
		fb = new FlyWithWings();
		qb = new Quack();
	}
}
