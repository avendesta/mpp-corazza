package problem4.fly;

import problem4.behaviour.FlyBehaviour;

public class CannotFly implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("\tcannot fly");
	}

}
