package problem4;

import problem4.base.Duck;
import problem4.ducks.DecoyDuck;
import problem4.ducks.MallardDuck;
import problem4.ducks.RedheadDuck;
import problem4.ducks.RubberDuck;

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
