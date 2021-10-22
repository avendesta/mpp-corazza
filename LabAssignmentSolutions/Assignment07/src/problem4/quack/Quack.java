package problem4.quack;

import problem4.behaviour.QuackBehaviour;

public class Quack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("\tquacking");
	}

}
