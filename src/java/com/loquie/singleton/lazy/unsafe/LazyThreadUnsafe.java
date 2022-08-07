package com.loquie.singleton.lazy.unsafe;

/**
 * <b>懒汉式 线程不安全</b>
 * <ul>
 *     <b>优点</b>
 * <li>起到了懒加载的效果
 * </ul>
 * <ul>
 *     <b>缺点</b>
 * <li>只能在单线程下使用，如果在多线程下，一个线程进入了 if (singleton == null) 判断语句块，还未来得及
 *   往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。所以 在多线程环境下不可使用这种方式
 * </ul>
 * <b>结论：在实际开发中，不要使用这种方式</b>
 *
 * @author loquie
 * @date 2022/8/7 16:40
 */
public class LazyThreadUnsafe {

    private LazyThreadUnsafe() {

    }

    private static LazyThreadUnsafe instance;

    /**
     * 当调用时，才创建单例对象 懒汉式
     *
     * @return LazyThreadUnsafe
     */
    public static LazyThreadUnsafe getInstance() {
        if (instance == null) {
            instance = new LazyThreadUnsafe();
        }
        return instance;
    }
}
