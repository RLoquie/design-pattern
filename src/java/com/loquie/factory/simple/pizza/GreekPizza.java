package com.loquie.factory.simple.pizza;

import com.loquie.factory.Pizza;

/**
 * @author loquie
 * @date 2022/8/7 19:13
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("制作希腊披萨，准备原材料");
    }
}
