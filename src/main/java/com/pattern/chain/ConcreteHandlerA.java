package com.pattern.chain;

/**
 * @author: yhl
 * @DateTime: 2020/11/19 21:16
 * @Description:
 */
public class ConcreteHandlerA extends Handler {

    @Override
    public void handleRequest(String request) {
        if ("requestA".equals(request)) {
            System.out.println(this.getClass().getSimpleName() + "deal with request " + request);
            return;
        }

        if (this.nextHandler != null) {
            this.nextHandler.handleRequest(request);
        }
    }
}
