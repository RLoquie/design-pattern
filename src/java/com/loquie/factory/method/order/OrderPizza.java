package com.loquie.factory.method.order;

import com.loquie.factory.Pizza;
import com.loquie.factory.util.PizzaUtil;


public abstract class OrderPizza {

    // 定义一个抽象方法，让各个工厂子类自己实现
	abstract Pizza createPizza(String orderType);

	public OrderPizza() {
		Pizza pizza;
		String orderType;
		do {
			orderType = PizzaUtil.getType();
			pizza = createPizza(orderType);
            if (pizza == null) {
                break;
            }
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		} while (true);
	}
}
