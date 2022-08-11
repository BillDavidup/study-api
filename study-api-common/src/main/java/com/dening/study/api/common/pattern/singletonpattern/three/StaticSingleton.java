package com.dening.study.api.common.pattern.singletonpattern.three;

/**
 * 登记式/静态内部类
 */
public class StaticSingleton {
    private StaticSingleton() {
    }

    private static class StaticSingletonHolder {
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    public static final StaticSingleton getInstance() {
        return StaticSingletonHolder.INSTANCE;
    }
}
