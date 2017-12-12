/**
 * 
 */
package com.game.duck.Strategy;

/**
 * @author faiza
 *
 */
public class MarlandDuck extends Duck{

	public MarlandDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	void display() {
		super.display();
		System.out.println("like a marland");
	}
}
