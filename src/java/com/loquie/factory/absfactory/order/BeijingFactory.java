package com.loquie.factory.absfactory.order;

import com.loquie.factory.Pizza;
import com.loquie.factory.absfactory.pizza.BeijingCheesePizza;
import com.loquie.factory.absfactory.pizza.BeijingPepperPizza;

public class BeijingFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("--------------------北京工厂--------------------");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BeijingCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BeijingPepperPizza();
        }
        return pizza;
    }

}
