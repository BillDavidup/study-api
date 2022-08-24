package com.dening.study.api.common.pattern.proxypattern.two;

import com.dening.study.api.common.pattern.proxypattern.one.IPerson;

/**
 * 调用JDK动态代理的客户端
 */
public class JdkDynamicClient {

    public static void main(String[] args) {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson zhaoLiu = jdkMeipo.getInstance(new ZhaoLiu());
        zhaoLiu.findLove();
    }

}
