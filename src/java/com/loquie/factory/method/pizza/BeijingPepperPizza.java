package com.loquie.factory.method.pizza;

import com.loquie.factory.Pizza;

public class BeijingPepperPizza extends Pizza {
	@Override
	public void prepare() {
		setName("北京胡椒披萨");
		System.out.println("制作奶酪披萨，准备原材料");
	}
}
