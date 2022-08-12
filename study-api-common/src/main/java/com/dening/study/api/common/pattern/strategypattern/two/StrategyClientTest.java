package com.dening.study.api.common.pattern.strategypattern.two;

import org.apache.commons.lang3.StringUtils;

public class StrategyClientTest {

    public static void main1(String[] args) {
        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
        PromotionActivity activity1111 = new PromotionActivity(new CashbackStrategy());

        activity618.execute();
        activity1111.execute();
    }

    /**
     * 此时，小伙伴们会发现，如果把上面这段客户端测试代码放到实际的业务场景中，其实并不实用。
     * 因为我们做活动的时候往往要根据不同的需求对促销策略进行动态选择，并不会一次性执行多种优惠。
     * 所以代码通常会这样写。
     *
     * @param args
     */
    public static void main2(String[] args) {
        PromotionActivity promotionActivity = null;

        String promotionKey = "COUPON";

        if (StringUtils.equals(promotionKey, "COUPON")) {
            promotionActivity = new PromotionActivity(new CouponStrategy());
        } else if (StringUtils.equals(promotionKey, "CASHBACK")) {
            promotionActivity = new PromotionActivity(new CashbackStrategy());
        }//......
        promotionActivity.execute();
    }

    /**
     * 这样改造之后，代码满足了业务需求，客户可根据自己的需求选择不同的优惠策略。但是，经过一段时间的业务积累，促销活动会越来越多。
     * 于是，程序员就开始经常加班，每次上活动之前都要通宵改代码，而且要做重复测试，判断逻辑可能也会变得越来越复杂。
     * 此时，我们要思考代码是否需要重构。回顾之前学过的设计模式，我们应该如何来优化这段代码呢？
     * 其实，可以结合单例模式和简单工厂模式，创建PromotionStrategyFactory类。
     *
     * @param args
     */
    public static void main(String[] args) {
        PromotionStrategyFacory.getPromotionKeys();
        String promotionKey = "COUPON";
        /**
         * 代码优化之后，程序员的维护工作也变得轻松了。每次上新活动都不影响原来的代码逻辑。
         */
        IPromotionStrategy promotionStrategy = PromotionStrategyFacory.getPromotionStrategy(promotionKey);
        promotionStrategy.doPromotion();
    }
}
