package com.loquie.singleton;

/**
 * <b>静态内部类</b>
 * <ul>
 *     <b>优点</b>
 * <li>这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
 * <li>静态内部类方式在 {@link SingletonInstance} 类被装载时并不会立即实例化，而是在需要实例化时，调用 getInstance() 方法，
 * 才会装载 {@link SingletonInstance} 类，从而完成 {@link StaticInnerClass} 的实例化。
 * <li>类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM 帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 * <li>避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
 * </ul>
 * <b>结论：在实际开发中，推荐使用</b>
 *
 * @author loquie
 * @date 2022/8/7 17:29
 */
public class StaticInnerClass {

    private StaticInnerClass() {

    }

    private static class SingletonInstance {
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    public static StaticInnerClass getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
