package com.offer._2;

/**
 * 饿汉式单例模式
 * 单例模式
 * @author ：jhys
 * @date ：Created in 2020/11/11 21:31
 * @Description ：
 */
public class Singleton1 {

    /**
     * 私有静态变量
     * 直接实例化
     * 丢失了延迟实例化带来的节约资源的优势
     */
    private static Singleton1 singleton = new Singleton1();

    /**
     * 私有构造函数
     */
    private Singleton1() {

    }

    /**
     * 公有获取单例对象静态函数
     * @return
     */
    public static Singleton1 getSingleton() {
        return singleton;
    }
}
