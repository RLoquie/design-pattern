package com.loquie.singleton.lazy.safe;

/**
 * <b>懒汉式 线程安全 同步方法</b>
 * <ul>
 *     <b>优点</b>
 * <li>解决了线程不安全问题
 * </ul>
 * <ul>
 *     <b>缺点</b>
 * <li>效率太低了，每个线程在想获得类的实例时候，执行 getInstance() 方法都要进行同步。而其实这个方法只执行一次实例化代码就够了，
 * 后面的想获得该类实例，直接 return 就行了。方法进行同步效率太低
 * </ul>
 * <b>结论：在实际开发中，不推荐使用这种方式</b>
 *
 * @author loquie
 * @date 2022/8/7 17:05
 */
public class LazySynchronizedMethod {

    private LazySynchronizedMethod() {

    }

    public static LazySynchronizedMethod instance;

    /**
     * 加入同步代码，解决线程不安全
     *
     * @return LazySynchronizedMethod
     */
    public static synchronized LazySynchronizedMethod getInstance() {
        if (instance == null) {
            instance = new LazySynchronizedMethod();
        }
        return instance;
    }
}
