package com.loquie.factory;

/**
 * @author loquie
 * @date 2022/8/7 19:07
 */
public abstract class Pizza {
    protected String name;

    public Pizza() {
    }

    public abstract void prepare();

    public void bake() {
        System.out.println(this.name + " 烘烤！");
    }

    public void cut() {
        System.out.println(this.name + " 切割！");
    }

    public void box() {
        System.out.println(this.name + " 打包！");
    }

    public void setName(String name) {
        this.name = name;
    }
}