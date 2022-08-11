package com.dening.study.api.common.pattern.singletonpattern.five;

public class SingletonClient {

    /**
     * todo 需要严格的多线程测试
     * @param args
     */
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingletonInstance();
        Singleton s2 = Singleton.getSingletonInstance();
        System.out.println("s1:" + s1);
        System.out.println(s1 == s2);
    }

}
