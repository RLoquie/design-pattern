package com.loquie.singleton.lazy.unsafe;

import com.loquie.singleton.lazy.safe.LazySynchronizedMethod;

/**
 * <b>懒汉式 线程安全 同步代码块</b>
 * <p>这种方式，本意是想对{@linkplain LazySynchronizedMethod 线程同步方法}实现方式的改进，因为前面同步方法效率太低，改为同步产生实例化的的代码块
 * <ul>
 *     <b>缺点</b>
 * <li><b>这种同步并不能起到线程同步的作用</b>。跟{@linkplain LazyThreadUnsafe 线程不安全}实现方式遇到的情形一致，假如一个线程进入了 if(singleton == null) 判断语句块，还未来得及往下执行， 另一个线程也通过了这个判断语句，这时便会产生多个实例
 * </ul>
 * <b>结论：在实际开发中，不能使用这种方式</b>
 *
 * @author loquie
 * @date 2022/8/7 17:12
 */
public class LazySynchronizedCodeBlock {

    private LazySynchronizedCodeBlock() {

    }

    public static LazySynchronizedCodeBlock instance;

    public static LazySynchronizedCodeBlock getInstance() {
        if (instance == null) {
            synchronized (LazySynchronizedCodeBlock.class) {
                instance = new LazySynchronizedCodeBlock();
            }
        }
        return instance;
    }
}
