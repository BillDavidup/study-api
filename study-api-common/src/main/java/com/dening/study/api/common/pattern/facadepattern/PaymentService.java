package com.dening.study.api.common.pattern.facadepattern;
// @Service
public class PaymentService {
    public boolean pay(GiftInfo pointsGift) {
        //扣减积分
        System.out.println("支付" + pointsGift.getName() + " 积分成功");
        return true;
    }
}
