package com.pattern.observe;

/**
 * @author: yhl
 * @DateTime: 2020/6/28 22:52
 * @Description:
 */
public class ConcreteFan implements Fan {

    private String fanName;

    public ConcreteFan(String fanName) {
        this.fanName = fanName;
    }

    @Override
    public void update(String msg) {
        System.out.println(fanName+"收到["+msg+"]这条消息");
    }
}
