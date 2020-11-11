package com.offer._2;

/**
 * @author ：jhys
 * @date ：Created in 2020/11/11 21:37
 * @Description ：
 */
public class Singleton3 {
    /**
     * 私有静态变量
     */
    private static Singleton3 singleton;

    /**
     * 私有构造函数
     */
    private Singleton3() {
    }

    /**
     * 公有获取单例对象静态函数
     * 加同步锁前后两次判断实例是否已存在
     * 缩小的同步代码块
     * @return
     */
    public static Singleton3 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton3.class) {
                if (singleton == null) {
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }

}
