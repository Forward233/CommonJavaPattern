package com.pattern.chain;

/**
 * @author: yhl
 * @DateTime: 2020/11/19 21:14
 * @Description: 抽象处理者
 */
public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String request);
}
