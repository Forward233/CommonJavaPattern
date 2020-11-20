package com.pattern.bridge;

/**
 * @author: yhl
 * @DateTime: 2020/11/20 14:09
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        IMessage message = new SmsMessage();
        AbstractMessage abstractMessage = new NormalMessage(message);
        abstractMessage.sendMessage("加班申请速批","王总");

        message = new EmailMessage();
        abstractMessage = new UrgencyMessage(message);
        abstractMessage.sendMessage("加班申请速批","王总");
    }
}
