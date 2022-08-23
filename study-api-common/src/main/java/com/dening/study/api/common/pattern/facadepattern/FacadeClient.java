package com.dening.study.api.common.pattern.facadepattern;

/**
 * 客户端调用
 */
public class FacadeClient {
    public static void main(String[] args) {
        GiftInfo giftInfo = new GiftInfo("《Spring 5核心原理》");
        GiftFacadeService giftFacadeService = new GiftFacadeService();
        giftFacadeService.exchange(giftInfo);
    }
}
