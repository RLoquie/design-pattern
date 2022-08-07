package com.loquie.factory.absfactory.order;

import com.loquie.factory.Pizza;

/**
 * 抽象工厂模式的抽象层
 */
public interface AbsFactory {

    /**
     * 让工厂子类来具体实现
     *
     * @param orderType 订单类别
     * @return Pizza
     */
    Pizza createPizza(String orderType);
}
