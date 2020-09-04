package com.pattern.adapt.clazz;

/**
 * @author: yhl
 * @DateTime: 2020/7/10 18:48
 * @Description:
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        System.out.println("开始进行适配...");
        super.adapteeRequest();
    }
}
