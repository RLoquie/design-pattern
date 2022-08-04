package com.loquie.singleton;

import com.loquie.singleton.hungry.HungryStaticMode;

public class SingletonTest {
    public static void main(String[] args) {
        hungryStaticModeTest();
    }

    /**
     * 饿汉式 静态变量测试
     */
    public static void hungryStaticModeTest() {
        HungryStaticMode singletonOne = HungryStaticMode.getInstance();
        HungryStaticMode singletonTwo = HungryStaticMode.getInstance();

        System.out.println(singletonOne == singletonTwo);

        System.out.println(singletonOne.hashCode());
        System.out.println(singletonTwo.hashCode());
    }
}
