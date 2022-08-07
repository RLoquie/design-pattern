package com.loquie.factory.method.order;

import com.loquie.factory.Pizza;
import com.loquie.factory.method.pizza.LondonCheesePizza;
import com.loquie.factory.method.pizza.LondonPepperPizza;


public class LondonOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LondonCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LondonPepperPizza();
        }
        return pizza;
    }

}
