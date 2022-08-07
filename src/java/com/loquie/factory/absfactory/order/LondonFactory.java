package com.loquie.factory.absfactory.order;


import com.loquie.factory.Pizza;
import com.loquie.factory.absfactory.pizza.BeijingPepperPizza;
import com.loquie.factory.absfactory.pizza.LondonCheesePizza;


public class LondonFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("--------------------伦敦工厂--------------------");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LondonCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BeijingPepperPizza();
		}
		return pizza;
	}

}
