package com.dening.study.api.common.pattern.strategypattern.two;

public class CouponStrategy implements IPromotionStrategy {
    public void doPromotion() {
        System.out.println("使用优惠券抵扣");
    }
}
