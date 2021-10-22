package lesson5.labs.prob2.quack;

import lesson5.labs.prob2.behaviour.QuackBehaviour;

public class Squeak implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("\tsqueaking");	
	}

}
