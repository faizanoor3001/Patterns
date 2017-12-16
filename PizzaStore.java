package com.pizza.factory;

public class PizzaStore {


	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory){
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type){
		Pizza pizza;
		//replaced new method with a create method and hence no more concrete implementations 
		// the code i.e. there in the simple pizza factory will be here 
		pizza = factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.box();
		pizza.deliver();
		return pizza;
	}
}
