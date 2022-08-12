package com.dening.study.api.common.pattern.strategypattern.three;

/**
 * 具体的支付方式：阿里支付宝
 */
public class AliPay extends Payment {
    public String getName() {
        return "支付宝";
    }

    protected double queryBalance(String uid) {
        return 900;
    }
}
