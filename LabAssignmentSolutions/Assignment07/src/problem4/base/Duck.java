package problem4.base;

import problem4.behaviour.FlyBehaviour;
import problem4.behaviour.Flyable;
import problem4.behaviour.QuackBehaviour;
import problem4.behaviour.Quackable;

public abstract class Duck implements Flyable, Quackable{

	protected FlyBehaviour fb;
	protected QuackBehaviour qb;
	public Duck() {
		
	}
	public void display() {
		System.out.println("\tdisplaying");
	}

	public void swim() {
		System.out.println("\tswimming");
	}

}
