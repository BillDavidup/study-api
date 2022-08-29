package com.dening.study.api.common.pattern.bridgepattern.two;

/**
 * 在上面的案例中，我们采用桥接模式解耦了“消息类型”和“消息紧急程度”这两个独立变化的维度。
 * 后续如果有更多的消息类型，比如微信、钉钉等，则直接新建一个类继承IMessage即可；如果紧急程度需要新增，
 * 则同样只需新建一个类实现AbstractMessage类即可。
 */
public class MessageClient {

    public static void main(String[] args) {

        IMessage message = new SmsMessage();
        AbstractMessage abstractMessage = new NormalMessage(message);
        abstractMessage.sendMessage("加班申请速批", "王总");

        message = new EmailMessage();
        abstractMessage = new UrgencyMessage(message);
        abstractMessage.sendMessage("加班申请速批", "王总");

    }

}
