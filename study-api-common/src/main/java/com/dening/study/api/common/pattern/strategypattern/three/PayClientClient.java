package com.dening.study.api.common.pattern.strategypattern.three;

/**
 * 客户端调用
 */
public class PayClientClient {
    public static void main(String[] args) {
        Order order = new Order("1", "2020031401000323", 324.5);
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
