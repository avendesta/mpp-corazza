package problem4.fly;

import problem4.behaviour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour{

	@Override
	public void fly() {
		System.out.println("\tfly with wings");
	}

}
