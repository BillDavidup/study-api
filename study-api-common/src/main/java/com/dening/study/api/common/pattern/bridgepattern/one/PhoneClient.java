package com.dening.study.api.common.pattern.bridgepattern.one;

public class PhoneClient {

    public static void main(String[] args) {
        // 获取折叠样式手机（品牌+样式）
        FoldedPhone xiaomiFoldedPhone = new FoldedPhone(new XiaoMi());
        xiaomiFoldedPhone.open();
        xiaomiFoldedPhone.call();
        xiaomiFoldedPhone.close();

        UpRightPhone xiaomiUpRightPhone = new UpRightPhone(new XiaoMi());
        xiaomiUpRightPhone.open();
        xiaomiUpRightPhone.call();
        xiaomiUpRightPhone.close();
    }

}
