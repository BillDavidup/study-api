package com.dening.study.api.common.pattern.strategypattern.three;

/**
 * 具体的支付方式：京东白条JDPay
 */
public class JDPay extends Payment {
    public String getName() {
        return "京东白条";
    }

    protected double queryBalance(String uid) {
        return 500;
    }
}
