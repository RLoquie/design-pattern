package com.loquie.factory.method.order;

import com.loquie.factory.util.AreaUtil;

public class PizzaStore {

	public static void main(String[] args) {
		String loc = AreaUtil.getArea();
		if (loc.equals("bj")) {
			new BeijingOrderPizza();
		} else {
			new LondonOrderPizza();
		}
	}
}
