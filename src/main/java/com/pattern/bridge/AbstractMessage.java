package com.pattern.bridge;

/**
 * @author: yhl
 * @DateTime: 2020/11/20 14:04
 * @Description:
 */
public abstract class AbstractMessage {

    IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }

    public void sendMessage(String message, String toUser) {
        this.message.send(message, toUser);
    }
}
