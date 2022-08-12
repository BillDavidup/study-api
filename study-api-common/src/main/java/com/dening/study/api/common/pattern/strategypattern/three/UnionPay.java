package com.dening.study.api.common.pattern.strategypattern.three;

/**
 * 具体的支付方式
 */
public class UnionPay extends Payment {
    public String getName() {
        return "银联支付";
    }

    protected double queryBalance(String uid) {
        return 120;
    }
}
