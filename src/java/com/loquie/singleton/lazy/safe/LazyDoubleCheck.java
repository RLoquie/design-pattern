package com.loquie.singleton.lazy.safe;

import com.loquie.singleton.lazy.unsafe.LazySynchronizedCodeBlock;

/**
 * <b>懒汉式 线程安全 双重检查</b>
 * <ul>
 *     <b>优点</b>
 * <li>Double-Check 概念是多线程开发中常使用到的，如代码中所示，我们进行了两次 if (singleton == null) 检查，这样就可以保证线程安全了。
 * <li>实例化代码只用执行一次，后面再次访问时，判断 if (singleton == null)，直接 return 实例化对象，也避免的反复进行方法同步。
 * <li>线程安全、延迟加载、效率较高
 * </ul>
 * <b>结论：在实际开发中，推荐使用这种单例设计模式</b>
 *
 * @author loquie
 * @date 2022/8/7 17:22
 */
public class LazyDoubleCheck {

    private LazyDoubleCheck() {

    }

    public static volatile LazyDoubleCheck instance;

    /**
     * 加入同步代码，解决线程不安全
     *
     * @return LazySynchronizedMethod
     */
    public static synchronized LazyDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (LazySynchronizedCodeBlock.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheck();
                }
            }
        }
        return instance;
    }
}
