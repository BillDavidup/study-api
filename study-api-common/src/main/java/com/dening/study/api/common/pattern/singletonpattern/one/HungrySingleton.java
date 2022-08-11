package com.dening.study.api.common.pattern.singletonpattern.one;

/**
 * 饿汉式单例-线程安全
 */
public class HungrySingleton {

    private HungrySingleton() {
    }

    private static HungrySingleton s = new HungrySingleton();

    public static HungrySingleton getSingletonInstance() {
        return s;
    }

}
