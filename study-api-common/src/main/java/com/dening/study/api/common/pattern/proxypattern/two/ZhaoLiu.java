package com.dening.study.api.common.pattern.proxypattern.two;

import com.dening.study.api.common.pattern.proxypattern.one.IPerson;

/**
 * 被代理的类
 */
public class ZhaoLiu implements IPerson {
    @Override
    public void findLove() {
        System.out.println("我要找个身材苗条，脸蛋好看的女生");
    }

    public void buyInsure() {

    }

}
