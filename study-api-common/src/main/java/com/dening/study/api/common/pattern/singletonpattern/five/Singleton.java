package com.dening.study.api.common.pattern.singletonpattern.five;

/**
 * 懒汉式-双重检查锁DCL，线程安全
 */
public class Singleton {

    /**
     * 1.私有化构造方法
     */
    private Singleton() {
    }

    /**
     * 2.持有引用
     */
    private static volatile Singleton s = null;

    public static Singleton getSingletonInstance() {
        if (null == s) {
            synchronized (Singleton.class) {
                if (null == s) {
                    s = new Singleton();
                }
            }
        }
        return s;
    }
}
