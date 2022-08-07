package com.loquie.factory.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author loquie
 * @date 2022/8/7 20:35
 */
public class AreaUtil {
    public static String getArea() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请选择地区：");
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
