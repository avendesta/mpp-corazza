package lesson5.labs.prob2.ducks;

import lesson5.labs.prob2.base.Duck;
import lesson5.labs.prob2.fly.FlyWithWings;
import lesson5.labs.prob2.quack.MuteQuack;

public class MallardDuck extends Duck {
	public MallardDuck() {
		fb = new FlyWithWings();
		qb = new MuteQuack();
	}
	@Override
	public void display() {
		System.out.println("\tdisplay");
	}

}
