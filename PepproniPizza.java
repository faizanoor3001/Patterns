package com.pizza.factory;

public class PepproniPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("In prepare of peproni pizza");
		}

	@Override
	public void bake() {
		System.out.println("In bake of peproni pizza");
		
	}

	@Override
	public void box() {
		System.out.println("In box of peproni pizza");
		
	}

	@Override
	public void deliver() {
		System.out.println("In deliver of peproni pizza");
		
	}

}
