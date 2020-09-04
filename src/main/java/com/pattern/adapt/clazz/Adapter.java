package com.pattern.adapt.clazz;

/**
 * @author: yhl
 * @DateTime: 2020/8/31 14:09
 * @Description:
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        System.out.println("实现一些想要的功能");
        super.adapteeRequest();
        System.out.println("实现一些想要的功能");
    }
}
