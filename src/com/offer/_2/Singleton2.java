package com.offer._2;

/**
 * 懒汉式单例模式
 * 线程安全
 * @author ：jhys
 * @date ：Created in 2020/11/11 21:34
 * @Description ：
 */
public class Singleton2 {

    private static Singleton2 singleton;

    private Singleton2() {

    }

    /**
     * 公有获取单例对象静态函数
     * @return
     * 在方法级别上加锁
     * 当一个线程进入该方法之后，其它线程试图进入该方法都必须等待，
     * 因此性能上有一定的损耗
     */
    public static synchronized Singleton2 getSingleton() {
        if (singleton == null) {
            singleton =  new Singleton2();
        }
        return singleton;
    }
}
