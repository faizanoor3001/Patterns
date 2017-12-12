/**
 * 
 */
package com.game.duck.Strategy;

/**
 * @author faiza
 *
 */
public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	void performFly(){
		flyBehavior.fly();
	}
	void performQuack(){
		quackBehavior.quack();
	}
	
	void swim(){
		System.out.println("Swim like a duck in a pond");
	}
	void display(){};
}
