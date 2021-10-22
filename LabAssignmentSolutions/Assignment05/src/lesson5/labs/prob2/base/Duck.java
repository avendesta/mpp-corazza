package lesson5.labs.prob2.base;

import lesson5.labs.prob2.behaviour.FlyBehaviour;
import lesson5.labs.prob2.behaviour.QuackBehaviour;

public abstract class Duck {

	protected FlyBehaviour fb;
	protected QuackBehaviour qb;
	public Duck() {
		
	}
	public void display() {
		System.out.println("\tdisplaying");
	}

	public void fly() {
		fb.fly();
	}

	public void quack() {
		qb.quack();
	}

	public void swim() {
		System.out.println("\tswimming");
	}

}
