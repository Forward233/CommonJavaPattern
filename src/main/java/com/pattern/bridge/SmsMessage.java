package com.pattern.bridge;

/**
 * @author: yhl
 * @DateTime: 2020/11/20 14:02
 * @Description:
 */
public class SmsMessage implements IMessage {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用短信消息发送" + message + "给" + toUser);
    }
}
