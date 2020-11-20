package com.pattern.bridge;

/**
 * @author: yhl
 * @DateTime: 2020/11/20 14:08
 * @Description:
 */
public class NormalMessage extends AbstractMessage {

    public NormalMessage(IMessage message) {
        super(message);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        super.sendMessage(message, toUser);
    }
}
