package com.loquie.singleton.hungry;

/**
 * <b>饿汉式 静态代码块</b>
 * <p>
 * 这种方式和{@linkplain HungryStaticConstant 静态常量}其实类似，只不过将类实例化的过程放在了静态代码块 中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。
 * 优缺点和{@linkplain HungryStaticConstant 静态常量}是一样的。
 * <p>
 * <b>结论：这种单例模式可用，但是可能造成内存浪费</b>
 *
 * @author loquie
 * @date 2022/8/7 16:20
 */
public class HungryStaticCodeBlock {

    private HungryStaticCodeBlock() {

    }

    private static final HungryStaticCodeBlock instance;

    static {
        instance = new HungryStaticCodeBlock();
    }

    private static HungryStaticCodeBlock getInstance() {
        return instance;
    }
}
