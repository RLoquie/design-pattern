package com.loquie.factory.simple.order;

import com.loquie.factory.Pizza;
import com.loquie.factory.util.PizzaUtil;

/**
 * 简单工厂模式
 *
 * @author loquie
 * @date 2022/8/7 19:14
 */
public class OrderPizza {

    Pizza pizza;
    String orderType;

    public OrderPizza() {
        do {
            orderType = PizzaUtil.getType();
            pizza = SimpleFactory.createPizza(orderType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("");
                break;
            }
        } while (true);
    }
}
