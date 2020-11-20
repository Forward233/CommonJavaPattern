package com.pattern.bridge;

/**
 * @author: yhl
 * @DateTime: 2020/11/20 14:08
 * @Description:
 */
public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(IMessage message) {
        super(message);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "【加急】" + message;
        super.sendMessage(message, toUser);
    }
}
