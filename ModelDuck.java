package com.game.duck.Strategy;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Squeak();
	}
	
	@Override
	void display() {
		super.display();
		System.out.println("I am a model duck");
	}
	
	

}
