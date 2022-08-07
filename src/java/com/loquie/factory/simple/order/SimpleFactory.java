package com.loquie.factory.simple.order;

import com.loquie.factory.Pizza;
import com.loquie.factory.simple.pizza.CheesePizza;
import com.loquie.factory.simple.pizza.GreekPizza;

/**
 * @author loquie
 * @date 2022/8/7 19:45
 */
public class SimpleFactory {

    public static Pizza createPizza(String orderType) {

        Pizza pizza = null;

        System.out.println("--------------------使用简单工厂模式--------------------");

        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }

        return pizza;
    }
}
