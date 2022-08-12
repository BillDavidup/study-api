package com.dening.study.api.common.pattern.strategypattern.three;

/**
 * 具体的支付方式：微信支付WechatPay
 */
public class WechatPay extends Payment {
    public String getName() {
        return "微信支付";
    }

    protected double queryBalance(String uid) {
        return 263;
    }
}
