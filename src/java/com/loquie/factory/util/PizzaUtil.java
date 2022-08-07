package com.loquie.factory.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author loquie
 * @date 2022/8/7 19:36
 */
public class PizzaUtil {
    public static String getType() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入订购披萨种类：");
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
