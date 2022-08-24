package com.dening.study.api.common.pattern.proxypattern.one;

/**
 * 静态代理：代理类在编译前就确定了，拓展性不好
 */
public class StaticProxyClient {
    public static void main(String[] args) {
        ZhangLaosan zhangLaosan = new ZhangLaosan(new ZhangSan());
        zhangLaosan.findLove();
    }
}
