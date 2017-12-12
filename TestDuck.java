package com.game.duck.Strategy;

public class TestDuck {

	public static void main(String[] args) {
		
		Duck testDuck = new MarlandDuck();
		testDuck.swim();
		testDuck.display();
		testDuck.performFly();
		testDuck.performQuack();
		System.out.println("now here comes model duck with rocket fly");
		Duck testDuck1 = new ModelDuck();
		testDuck1.swim();
		testDuck1.performFly();
		testDuck1.performQuack();
		testDuck1.setFlyBehavior(new RocketPoweredFlyBehavior());
		testDuck1.setQuackBehavior(new Quack());
		testDuck1.display();
		testDuck1.performFly();
		testDuck1.performQuack();
	}
}
