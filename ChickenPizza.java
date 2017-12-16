package com.pizza.factory;

public class ChickenPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("In prepare of chicken pizza");
		
	}

	@Override
	public void bake() {
		System.out.println("In bake of chicken pizza");
		
	}

	@Override
	public void box() {
		System.out.println("In box of chicken pizza");
		
	}

	@Override
	public void deliver() {
		System.out.println("In deliver of chicken pizza");
		
	}

}
