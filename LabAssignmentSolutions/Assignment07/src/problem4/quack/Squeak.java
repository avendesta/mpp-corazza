package problem4.quack;

import problem4.behaviour.QuackBehaviour;

public class Squeak implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("\tsqueaking");	
	}

}
