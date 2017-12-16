package com.pizza.factory;

public class TestPizzaStore {
	public static void main(String args[]){
		
		
		PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
		pizzaStore.orderPizza("cheese");
	}

}
