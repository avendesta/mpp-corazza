package lesson5.labs.prob2;

import lesson5.labs.prob2.base.Duck;
import lesson5.labs.prob2.ducks.DecoyDuck;
import lesson5.labs.prob2.ducks.MallardDuck;
import lesson5.labs.prob2.ducks.RedheadDuck;
import lesson5.labs.prob2.ducks.RubberDuck;

public class Main {
	public static void main(String[] args) {
		Duck[] ducks = 
			{ new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck()};
		for(Duck d: ducks) {
			System.out.println(d.getClass().getSimpleName() + ":");
			d.display();
			d.fly();
			d.quack();
			d.swim();
		}
	}
}
