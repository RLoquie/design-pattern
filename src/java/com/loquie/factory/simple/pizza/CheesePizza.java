package com.loquie.factory.simple.pizza;

import com.loquie.factory.Pizza;

/**
 * @author loquie
 * @date 2022/8/7 19:10
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("制作奶酪披萨，准备原材料");
    }
}
