package com.dening.study.api.common.pattern.singletonpattern.best;

public class BestSingletonUserClient {

    public static void main(String[] args) {

        BestSingletonUser s1 = BestSingletonUser.SingletonEnum.SINGLETON.getSingletonInstance();
        BestSingletonUser s2 = BestSingletonUser.SingletonEnum.SINGLETON.getSingletonInstance();
        System.out.println("s1:" + s1);
        System.out.println(s1 == s2);

        // BestSingletonUser s3 = BestSingletonUser.SingletonEnum.SINGLETON2.getSingletonInstance();
        // System.out.println("s3:" + s3);

    }

}
