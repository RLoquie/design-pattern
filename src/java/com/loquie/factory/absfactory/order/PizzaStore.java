package com.loquie.factory.absfactory.order;

import com.loquie.factory.util.AreaUtil;

public class PizzaStore {

	public static void main(String[] args) {
		String loc = AreaUtil.getArea();
		if (loc.equals("bj")) {
			new OrderPizza(new BeijingFactory());
		} else {
			new OrderPizza(new LondonFactory());
		}
	}
}
