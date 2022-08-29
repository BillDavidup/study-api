package com.dening.study.api.common.pattern.bridgepattern.two;

/**
 * 短信消息的实现类
 * SMS(Short IMessage Service)短信消息服务
 */
public class SmsMessage implements IMessage {
    public void send(String message, String toUser) {
        System.out.println("使用短信消息发送" + message + "给" + toUser);
    }
}
