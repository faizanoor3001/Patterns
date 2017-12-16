package com.pizza.factory;

public class SimplePizzaFactory {
	
	public Pizza createPizza(String type){
		Pizza pizza = null;
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		}else if(type.equals("Pepproni")){
			pizza = new PepproniPizza();
		}else if(type.equals("cheese")){
			pizza = new ChickenPizza();
		}
		
		return pizza;
	}

}
