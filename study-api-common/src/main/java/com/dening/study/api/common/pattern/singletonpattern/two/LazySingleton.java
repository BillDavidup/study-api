package com.dening.study.api.common.pattern.singletonpattern.two;

public class LazySingleton {

    private LazySingleton() {
    }

    private static LazySingleton s = null;

    public static LazySingleton getSingletonInstance () {
        if (null == s) {
            s = new LazySingleton();
        }
        return s;
    }


}
