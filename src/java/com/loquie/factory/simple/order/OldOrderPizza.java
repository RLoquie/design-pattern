package com.loquie.factory.simple.order;

import com.loquie.factory.Pizza;
import com.loquie.factory.simple.pizza.CheesePizza;
import com.loquie.factory.simple.pizza.GreekPizza;
import com.loquie.factory.util.PizzaUtil;

/**
 * 传统模式
 *
 * @author loquie
 * @date 2022/8/7 19:14
 */
public class OldOrderPizza {

    public OldOrderPizza() {
        Pizza pizza;
        // 订购披萨类型
        String orderType;

        do {
            orderType = PizzaUtil.getType();
            if ("greek".equals(orderType)) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if ("cheese".equals(orderType)) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            } else {
                break;
            }

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);
    }
}
