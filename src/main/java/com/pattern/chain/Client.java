package com.pattern.chain;


/**
 * @author: yhl
 * @DateTime: 2020/11/19 21:19
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNextHandler(handlerB);
        handlerA.handleRequest("requestB");
    }
}
