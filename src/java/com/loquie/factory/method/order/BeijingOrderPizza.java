package com.loquie.factory.method.order;

import com.loquie.factory.Pizza;
import com.loquie.factory.method.pizza.BeijingCheesePizza;
import com.loquie.factory.method.pizza.BeijingPepperPizza;


public class BeijingOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BeijingCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BeijingPepperPizza();
        }
        return pizza;
    }

}
