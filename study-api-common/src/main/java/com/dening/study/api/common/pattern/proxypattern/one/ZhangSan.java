package com.dening.study.api.common.pattern.proxypattern.one;

/**
 * 被代理对象
 */
public class ZhangSan implements IPerson {

    public void findLove() {
        System.out.println("儿子张三提出要求");
    }

}
