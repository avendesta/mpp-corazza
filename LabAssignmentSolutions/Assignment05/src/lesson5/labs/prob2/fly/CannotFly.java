package lesson5.labs.prob2.fly;

import lesson5.labs.prob2.behaviour.FlyBehaviour;

public class CannotFly implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("\tcannot fly");
	}

}
