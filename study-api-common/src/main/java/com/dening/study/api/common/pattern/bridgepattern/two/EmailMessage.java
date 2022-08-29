package com.dening.study.api.common.pattern.bridgepattern.two;

/**
 * 邮件消息的实现类
 */
public class EmailMessage implements IMessage {
    public void send(String message, String toUser) {
        System.out.println("使用邮件消息发送" + message + "给" + toUser);
    }
}
