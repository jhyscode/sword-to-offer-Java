package com.offer._2;

/**
 * 实现Singleton模式
 * @author ：jhys
 * @date ：Created in 2020/11/11 21:15
 * @Description ：
 */
public class Singleton {

    /**
     * 私有静态变量
     */
    private static Singleton singleton;

    /**
     * 私有构造函数
     */
    private Singleton() {

    }

    /**
     * 公有获取单例对象静态函数
     * @return
     */
    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

