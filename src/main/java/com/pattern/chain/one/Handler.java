package com.pattern.chain.one;

/**
 * @author: yhl
 * @DateTime: 2020/11/20 7:26
 * @Description:
 */
public abstract class Handler {
    protected Handler chain;

    public void next(Handler handler) {
        this.chain = handler;
    }

    public abstract void doHandler(Member member);
}
