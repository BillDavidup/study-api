package com.dening.study.api.common.pattern.strategypattern.two;

public class EmptyStrategy implements IPromotionStrategy {
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
