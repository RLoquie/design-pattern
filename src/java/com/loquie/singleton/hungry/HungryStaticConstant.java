package com.loquie.singleton.hungry;

/**
 * <b>饿汉式 静态常量</b>
 *
 * <ul>
 *     <b>优点</b>
 * <li>这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * </ul>
 *
 * <ul>
 *     <b>缺点</b>
 * <li>在类装载的时候就完成实例化，没有达到懒加载的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费
 * <li>这种方式基于 classloader 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，在单例模式中大多数都是调用 getInstance() 方法。
 * 但是导致类装载的原因有很多种，因此不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 就没有达到懒加载的效果
 * </ul>
 * <b>结论：这种单例模式可用，可能造成内存浪费</b>
 *
 * @author loquie
 * @date 2022/8/5 00:51
 */
public class HungryStaticConstant {

    private HungryStaticConstant() {

    }

    public static final HungryStaticConstant instance = new HungryStaticConstant();

    public static HungryStaticConstant getInstance() {
        return instance;
    }
}