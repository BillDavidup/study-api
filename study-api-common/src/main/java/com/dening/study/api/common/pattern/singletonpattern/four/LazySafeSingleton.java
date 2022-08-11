package com.dening.study.api.common.pattern.singletonpattern.four;

/**
 * 懒汉式，线程安全
 */
public class LazySafeSingleton {
    private static LazySafeSingleton instance;

    private LazySafeSingleton() {
    }

    public static synchronized LazySafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazySafeSingleton();
        }
        return instance;
    }
}
