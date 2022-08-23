package com.dening.study.api.common.pattern.facadepattern;

// @Service
public class ShippingService {
    //发货
    public String delivery(GiftInfo giftInfo) {
        //物流系统的对接逻辑
        System.out.println(giftInfo.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
