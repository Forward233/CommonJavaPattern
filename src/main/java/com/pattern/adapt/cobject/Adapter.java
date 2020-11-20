package com.pattern.adapt.cobject;

import com.pattern.adapt.clazz.Adaptee;
import com.pattern.adapt.clazz.Target;

/**
 * @author: yhl
 * @DateTime: 2020/8/31 14:16
 * @Description:
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("实现一些想要的功能");
        adaptee.adapteeRequest();
        System.out.println("实现一些想要的功能");
    }
}
