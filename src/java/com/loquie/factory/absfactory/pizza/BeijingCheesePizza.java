package com.loquie.factory.absfactory.pizza;

import com.loquie.factory.Pizza;

public class BeijingCheesePizza extends Pizza {

	@Override
	public void prepare() {
		setName("北京奶酪披萨");
		System.out.println("制作奶酪披萨，准备原材料");
	}

}
