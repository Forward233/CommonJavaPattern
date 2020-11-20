package com.pattern.build.two;

import com.pattern.chain.one.Member;

/**
 * @author: yhl
 * @DateTime: 2020/11/20 10:34
 * @Description:
 */
public abstract class Handler<T> {

    protected Handler<T> chain;

    public void next(Handler<T> handler) {
        this.chain = handler;
    }

    public abstract void doHandler(Member member);


    public static class Builder<T> {
        protected Handler<T> head;
        protected Handler<T> tail;

        public Builder<T> addHandler(Handler<T> handler) {
            if (head == null) {
                this.head = handler;
                this.tail = handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;
            return this;
        }

        public Handler<T> build() {
            return this.head;
        }
    }
}
