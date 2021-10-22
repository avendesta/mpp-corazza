package lesson5.labs.prob2.fly;

import lesson5.labs.prob2.behaviour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour{

	@Override
	public void fly() {
		System.out.println("\tfly with wings");
	}

}
