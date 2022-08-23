package com.dening.study.api.common.pattern.facadepattern;

// 门面服务聚合所有子模块的服务，调用其方法 @Service
public class GiftFacadeService {

    private QualifyService qualifyService = new QualifyService();
    private PaymentService pointsPaymentService = new PaymentService();
    private ShippingService shopingService = new ShippingService();

    //兑换
    public void exchange(GiftInfo giftInfo){
        if(qualifyService.isAvailable(giftInfo)){
            //资格校验通过
            if(pointsPaymentService.pay(giftInfo)){
                //如果支付积分成功
                String shippingOrderNo = shopingService.delivery(giftInfo);
                System.out.println("物流系统下单成功,订单号是:"+shippingOrderNo);
            }
        }
    }

}
