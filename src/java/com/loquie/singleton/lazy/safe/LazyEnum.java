package com.loquie.singleton.lazy.safe;

/**
 * <b>懒汉式 线程安全 枚举</b>
 * <ul>
 *     <b>优点</b>
 * <li>这借助 JDK1.5 中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 * <li>这种方式是 <a href="https://baike.baidu.com/item/Effective%20Java/56508353?fr=aladdin">《Effective Java》</a>  作者 <a href="https://baike.baidu.com/item/Josh%20Bloch/4419184?fr=aladdin">Josh Bloch</a> 提倡的方式
 * </ul>
 * <b>结论：在实际开发中，推荐使用</b>
 *
 * @author loquie
 * @date 2022/8/7 17:38
 */
enum LazyEnum {
    INSTANCE;
    public void method() {
        System.out.println("method");
    }
}
