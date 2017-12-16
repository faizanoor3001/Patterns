package com.pizza.factory;

public class CheesePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("In prepare of cheese pizza");

	}

	@Override
	public void bake() {
		System.out.println("In bake of cheese pizza");

	}

	@Override
	public void box() {
		System.out.println("In box of cheese pizza");

	}

	@Override
	public void deliver() {
		System.out.println("In deliver of cheese pizza");

	}

}
