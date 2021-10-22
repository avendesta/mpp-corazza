package problem4.ducks;

import problem4.base.Duck;
import problem4.fly.FlyWithWings;
import problem4.quack.MuteQuack;

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
