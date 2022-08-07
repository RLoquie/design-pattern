package com.loquie.factory.absfactory.order;

import com.loquie.factory.Pizza;
import com.loquie.factory.util.PizzaUtil;

public class OrderPizza {

    AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza;
        String orderType;
        this.factory = factory;
        do {
            orderType = PizzaUtil.getType();

            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("创建" + orderType + "订单失败！");
                break;
            }
        } while (true);
    }
}
